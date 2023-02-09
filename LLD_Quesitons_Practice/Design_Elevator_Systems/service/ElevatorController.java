package LLD_Quesitons_Practice.Design_Elevator_Systems.service;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorCar;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorDirection;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorRequest;
import LLD_Quesitons_Practice.Design_Elevator_Systems.models.ElevatorStatus;
import org.jetbrains.annotations.NotNull;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {
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
                // internal request can be many you can take a array
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

    public void controlElevator(){
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

    public void moveElevator(PriorityQueue<ElevatorRequest> queue,ElevatorDirection elevatorDirection){
        while(!queue.isEmpty()){
            ElevatorRequest nextFloorPerson = queue.poll();
            System.out.println("Next for person : "+ nextFloorPerson.getDestinationFloor());
            elevatorCar.move(nextFloorPerson.getDestinationFloor(),elevatorDirection);
        }
        // add data from pending queue to minFloor.
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

