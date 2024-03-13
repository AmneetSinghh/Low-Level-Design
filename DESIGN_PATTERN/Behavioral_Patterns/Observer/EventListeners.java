package design_pattern.Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// publish subscriber pattern.
// subject is file : State is open, close, delte, read
// publisher is FilePublisher
// subscribers are EmailAlert, LoggAlert .....
public class EventListeners {
    public static void main(String args[]){
        Manager manager = new Manager(new EventManager());
        // add subscribers.
        manager.eventManager.subscribe(FileState.OPEN,
                new EmailAlertListener(
                        "Amneet Singh",
                        "harryamneet600@gmail.com"
                ));

        manager.eventManager.subscribe(FileState.OPEN,
                new EmailAlertListener(
                        "Aditya Aggarwal",
                        "harryamneet600@gmail.com"
                ));

        manager.eventManager.subscribe(FileState.CLOSE,
                new EmailAlertListener(
                        "Aditya Aggarwal",
                        "harryamneet600@gmail.com"
                ));
        manager.eventManager.subscribe(FileState.CLOSE,
                new LoggingListener(
                        "File is closed.",
                        "The message is file is closed."
                ));
        manager.openFile();
        manager.CloseFile();

    }
}

interface IEventManager{ // publisher interface
    public void subscribe(FileState eventType, EventListener Event);
    public void unSubscribe(FileState eventType, EventListener Event);
    public void notify(FileState eventType, String data);
}

// It is publisher, but not the concrete publisher that contains the business logic, example the state of the object that is observing.
class EventManager implements IEventManager{

    HashMap<FileState, List<EventListener>> listeners = new HashMap<>();
    @Override
    public void subscribe(FileState eventType, EventListener eventListener) {
        if(listeners.containsKey(eventType)) {
            listeners.get(eventType).add(eventListener);
        }
        else{
            listeners.put(eventType,new ArrayList<>());
            listeners.get(eventType).add(eventListener);
        }
    }
    @Override
    public void unSubscribe(FileState eventType, EventListener eventListener) {
        listeners.remove(eventType,eventListener);// iterate in array. remove that.

    }
    @Override
    public void notify(FileState eventType, String data) {
            for(EventListener event : listeners.get(eventType)){
                event.udpate(data);
            }
    }
}



interface EventListener{ // subscriber interface.
    public void udpate(String fileName);
}

class EmailAlertListener implements EventListener{

    String name;
    String email;
    public EmailAlertListener(String name, String email){
        this.name = name;
        this.email = email;
    }
    @Override
    public void udpate(String fileName) {
        System.out.println("Email sent to Name : "+name+" Email : "+email+" For fileName : "+ fileName);
    }
}

class LoggingListener implements EventListener{

    String message;
    String log;
    public LoggingListener(String message, String log){
        this.message = message;
        this.log = log;
    }
    @Override
    public void udpate(String fileName) {
        System.out.println("Log data Message : "+message+" Log : "+log+" For fileName : "+ fileName);
    }
}


// It is the subject : The different types of states of object. when change it get triggered.
class Manager{
    IEventManager eventManager;
    public Manager(IEventManager eventManager){
        this.eventManager = eventManager;
    }
    public void openFile(){
        eventManager.notify(FileState.OPEN,"File open is triggered");
    }
    public void CloseFile(){
        eventManager.notify(FileState.CLOSE,"File Close is triggered");
    }
    public void readFile(){
        eventManager.notify(FileState.READ,"File Read is triggered");
    }
    public void deleteFile(){
        eventManager.notify(FileState.DELETE,"File Delete is triggered");
    }
}

// we can have muliple type of publishers, like one FilePublisher that is tracking any changes in files state many types of publishers.



enum FileState{
    OPEN,
    CLOSE,
    READ,
    DELETE
}