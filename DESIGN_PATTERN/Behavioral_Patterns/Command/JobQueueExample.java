package design_pattern.Behavioral_Patterns.Command;

import java.util.LinkedList;
import java.util.Queue;

// here we didnt use the invokers.

public class JobQueueExample {
    // we not need the invoker in this.
    public static void main(String args[]){
        Queue<Task> taskQueue = new LinkedList<>();
        DataBase dataBase = new DataBase();
        NetworkApi networkApi = new NetworkApi();

        taskQueue.add(new DatabaseReadAndUpdateOperationsCommand(dataBase));// this just know it using command interface
        taskQueue.add(new NetworkReadInsertOperationsCommand(networkApi));
        taskQueue.add(new DatabaseReadInsertOperationsCommand(dataBase));


        // tasks are added into the task queue.
        // execute each task by separate thread.

        while(!taskQueue.isEmpty()){
            System.out.println("***************** Implementing Task ******************");
            Task task = taskQueue.peek();
            task.execute();
            taskQueue.poll();
        }



    }
}


// command interface.
interface Task{
    public void execute();
}

// concrete command.

// we take some operations make them into separate object, then do ran it asynchronously.
class DatabaseReadAndUpdateOperationsCommand implements Task{

    DataBase dataBase;
    public DatabaseReadAndUpdateOperationsCommand(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.updateDatabase();
        dataBase.readFromDatabase();
        dataBase.updateDatabase();
    }
}

class DatabaseReadInsertOperationsCommand implements Task{

    DataBase dataBase;
    public DatabaseReadInsertOperationsCommand(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.insertIntoDatabase();
        dataBase.readFromDatabase();
        dataBase.insertIntoDatabase();
    }
}

class NetworkReadInsertOperationsCommand implements Task{

    NetworkApi networkApi;
    public NetworkReadInsertOperationsCommand(NetworkApi networkApi){
        this.networkApi = networkApi;
    }
    @Override
    public void execute() {
        networkApi.readFromNetworkApi();
        networkApi.insertIntoNetworkApi();
    }
}
class DataBase{
    public void readFromDatabase(){
        System.out.println("Read from database");
        // more operations.
    }
    public void insertIntoDatabase(){
        System.out.println("insert into database");
        // more operations.
    }
    public void updateDatabase(){
        System.out.println("update database");
        // more operations.
    }
    public void getStFromDatabase(){
        System.out.println("get st from database");
        // more operations.
    }
    public void deletewholeDatabase(){
        System.out.println("delete whole database");
        // more operations.
    }
}

class NetworkApi{
    public void readFromNetworkApi(){
        System.out.println("Read from network api");
        // more operations.
    }
    public void insertIntoNetworkApi(){
        System.out.println("insert into network api");
        // more operations.
    }
    public void updateNetoworkApi(){
        System.out.println("update networkApi");
        // more operations.
    }
    public void getStFromNetworkApi(){
        System.out.println("get st from network api");
        // more operations.
    }
    public void deletewholeNetworkAPi(){
        System.out.println("delete whole network api");
        // more operations.
    }
}

