package LLD;


import java.util.LinkedList;
import java.util.Queue;

class Message {
    private int id;
    private double data;

    // constructors and getter/setters
}
class DataQueue {
    private final Queue<Message> queue = new LinkedList<>();
    private final int maxSize;
    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    DataQueue(int maxSize) {
        this.maxSize = maxSize;
    }

}


public class MainTesting {
    private final Object IS_NOT_FULL = new Object();

    private void notifyIsNotFull() {
        synchronized (IS_NOT_FULL) {

        }
    }

    public static void main(String[] args) {

    }
}
