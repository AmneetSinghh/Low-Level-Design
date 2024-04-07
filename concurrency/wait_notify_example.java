package concurrency;
import java.util.ArrayList;
import java.util.List;

class Data {

    private int packet;// because sender redeiver using same picket.

    private boolean transfer = true;// true means receiver waiting.

    public synchronized int receive(){
        while(transfer){
            try{
                wait();
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        transfer = true;
        int returnPacket = packet;// previous packet.
        notify();
        return returnPacket;
    }

    public synchronized void send(int packet) {
        while(!transfer){
            try{
                wait();
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        transfer = false;// receiver will not wait.
        this.packet = packet;
        notify();
    }
}



// print even.
class Sender implements Runnable {
    private Data data;
    public Sender(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        List<Integer> packets = new ArrayList<>();
        for(int i=1;i<=100;i++){
            data.send(i);
            //Util.waitForSometime();
        }
    }
}

// print odd.
class Receiver implements Runnable {
    private Data data;
    public Receiver(Data data){
            this.data = data;
    }

    // standard constructors

    public void run() {

//        for(String receivedMessage = data.receive();
//            !"End".equals(receivedMessage);
//            receivedMessage = data.receive()) {
//            System.out.println(receivedMessage+);
//            //Util.waitForSometime();
//        }
    }
}

public class wait_notify_example {

    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));
        sender.start();
        receiver.start();
    }
}
