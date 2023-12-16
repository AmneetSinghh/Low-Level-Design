package DESIGN_PATTERN.Creational_Patterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
 First way
*/
public class Singleton {
    public static void main(String args){
        ClassicSingletonPattern s;
    }
}
// refer head first book, synchronozed will make slow..

class ClassicSingletonPattern{
    private static ClassicSingletonPattern uniqueInstance;

    private ClassicSingletonPattern(){}

    // this getInstnace is lazy initilization, because if we never need this, it never get created. but if we did somehting with constructor
    // construcotr get called everytime when user makes an object.
    public static ClassicSingletonPattern getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ClassicSingletonPattern();
        }
        return uniqueInstance;
    }
}




/*
 Second way
*/
class ClassicSingletonPatternMultithreading{
    private static ClassicSingletonPatternMultithreading uniqueInstance;

    private ClassicSingletonPatternMultithreading(){}

    // this getInstance is lazy initialization, because if we never need this, it never get created. but if we did somehting with constructor
    // constructor get called everytime when user makes an object.

    /*
     If at X time 1000 threads are calling this method, then only one thread can enter this function, so synchronized is slow.
     */
    public static synchronized ClassicSingletonPatternMultithreading getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ClassicSingletonPatternMultithreading();
        }
        return uniqueInstance;
    }
}
//synchronized is slow, and most imp thing we only need to multiple threads on entering this getInstance method the first time while creating object.


/*
 Third way
*/

/*
* Multithreading Environment:
* if multiple threads are using above class, so every time thread will get blocked so if 1000 paralell threads 1 is under function, 999 are waiting.
* we need lock only once when the instance is creared.
*/


class ClassicSingletonPatternDoubleLock{
    private static ClassicSingletonPatternDoubleLock uniqueInstance;
    private static final Lock lock = new ReentrantLock(); // Create a ReentrantLock


    private ClassicSingletonPatternDoubleLock(){}
    public static ClassicSingletonPatternDoubleLock getInstance(){
        if(uniqueInstance == null){// only first time this will run,
            lock.lock();
            if(uniqueInstance == null){
                uniqueInstance = new ClassicSingletonPatternDoubleLock();
            }
            lock.unlock();
            return uniqueInstance;
        }
        return uniqueInstance;
    }
}

/*
 Fourth way
*/
// eagerly instantiation. not lazy initilization.

class ClassicSingletonPatternMultithreadingEagerly{
    private static ClassicSingletonPatternMultithreadingEagerly uniqueInstance = new ClassicSingletonPatternMultithreadingEagerly();

    private ClassicSingletonPatternMultithreadingEagerly(){}

    // this getInstnace is lazy initilization, because if we never need this, it never get created. but if we did somehting with constructor
    // construcotr get called everytime when user makes an object.
    public static  ClassicSingletonPatternMultithreadingEagerly getInstance(){
        return uniqueInstance;
    }
}





