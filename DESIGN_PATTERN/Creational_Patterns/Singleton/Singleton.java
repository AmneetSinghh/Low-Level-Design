package DESIGN_PATTERN.Creational_Patterns.Singleton;

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




// singleton methods while dealing with multithreading/

class ClassicSingletonPatternMultithreading{
    private static ClassicSingletonPatternMultithreading uniqueInstance;

    private ClassicSingletonPatternMultithreading(){}

    // this getInstnace is lazy initilization, because if we never need this, it never get created. but if we did somehting with constructor
    // construcotr get called everytime when user makes an object.
    public static  synchronized ClassicSingletonPatternMultithreading getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ClassicSingletonPatternMultithreading();
        }
        return uniqueInstance;
    }
}
//synchronized is slow, and most imp thing we only need to multiple threads on entering this getInstance method the first time while creating object.



// another way
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





