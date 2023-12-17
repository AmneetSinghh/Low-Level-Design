package LLD.Elevator_Systems.service;
// import org.jetbrains.annotations.NotNull;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import LLD.Elevator_Systems.models.ElevatorCar;
import LLD.Elevator_Systems.models.ElevatorDirection;
import LLD.Elevator_Systems.models.ElevatorRequest;
import LLD.Elevator_Systems.models.ElevatorStatus;

public class ElevatorController implements IElevatorController{
    ElevatorCar elevatorCar;
    PriorityQueue<ElevatorRequest> minFloor = new PriorityQueue<>(new MyComparator2());
    PriorityQueue<ElevatorRequest> maxFloor = new PriorityQueue<ElevatorRequest>(new MyComparator1());
    Queue<ElevatorRequest> pendingQueue = new LinkedList<>();


    public ElevatorController(int id){
        elevatorCar = new ElevatorCar(id);
    }


    public void submitRequest(ElevatorRequest request){
//        System.out.println("Elevator Controller : Entering submit Request for person: "+ person.+" "+ person.getElevatorDirection());
//        System.out.println("Current elevator direction : "+ elevatorCar.getElevatorDirection()+" current floor : "+ elevatorCar.getCurrentFloor());

        // external Request submit and internal request submit.

        if(elevatorCar.getElevatorDirection() == ElevatorDirection.UP){
            if(request.getSourceFloor() >=this.elevatorCar.getCurrentFloor()){
                System.out.println("Inserted into minFloor queue");
                minFloor.add(request);
            }
            else{
                System.out.println("Inserted into pending queue");
                pendingQueue.add(request);
            }
        }
        else{
            if(request.getSourceFloor() <this.elevatorCar.getCurrentFloor()){
                System.out.println("Inserted into maxFloor queue");
                maxFloor.add(request);
            }
            else{
                System.out.println("Inserted into pending queue");
                pendingQueue.add(request);
            }
        }
        controlElevator();
    }
    // when to change direction to DOWN?

    private void controlElevator(){
        while(!minFloor.isEmpty() || !maxFloor.isEmpty() || !pendingQueue.isEmpty()){
            elevatorCar.setElevatorStatus(ElevatorStatus.MOVING);
            System.out.println("********* Elevator Status ************* : "+ elevatorCar.getElevatorStatus()+" Direction -> "+ elevatorCar.getElevatorDirection());
            if(elevatorCar.getElevatorDirection() == ElevatorDirection.UP){
                moveElevator(minFloor,ElevatorDirection.UP);
            }
            else{
                moveElevator(maxFloor,ElevatorDirection.DOWN);
            }
        }
        elevatorCar.setElevatorStatus(ElevatorStatus.IDLE);
        System.out.println("********* Elevator Status ************* : "+ elevatorCar.getElevatorStatus());
    }

    private void moveElevator(PriorityQueue<ElevatorRequest> queue,ElevatorDirection elevatorDirection){
        // In one time we will only get 1 request. no need for while loop.
        while(!queue.isEmpty()){
            ElevatorRequest nextFloorPerson = queue.poll();
            System.out.println("Next for person : "+ nextFloorPerson.getDestinationFloor());
            elevatorCar.move(nextFloorPerson.getDestinationFloor(),elevatorDirection);
        }
        if(elevatorDirection.equals(ElevatorDirection.UP)){
            elevatorCar.setElevatorDirection(ElevatorDirection.DOWN);
        }
        else{
            elevatorCar.setElevatorDirection(ElevatorDirection.UP);
        }
        // change lift direction.
        // add data from pending queue to minFloor for future.
        while(!pendingQueue.isEmpty()){
            System.out.println("Adding to the pending queue: "+ pendingQueue.peek().getDestinationFloor()+ " Direction: "+ pendingQueue.peek().getElevatorDirection());
            queue.add(pendingQueue.peek());
        }
    }
}


class MyComparator1 implements Comparator<ElevatorRequest>
{
    public int compare(ElevatorRequest x, ElevatorRequest y){
        return y.getDestinationFloor() - x.getDestinationFloor();
    }
}

class MyComparator2 implements Comparator<ElevatorRequest>
{
    public int compare(ElevatorRequest x, ElevatorRequest y){
        return x.getDestinationFloor() - y.getDestinationFloor();
    }
}

