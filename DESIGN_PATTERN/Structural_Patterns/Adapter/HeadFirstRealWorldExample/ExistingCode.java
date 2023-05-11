package DESIGN_PATTERN.Structural_Patterns.Adapter.HeadFirstRealWorldExample;

public class ExistingCode {
    public static void main(String args[]){
        Duck mallardDuck = new MallardDuck();
        useMallardDuck(mallardDuck);
        System.out.println("-----------------------------------");
        Duck roundDuck = new RoundDuck();
        useRounddDuck(roundDuck);
        System.out.println("-----------------------------------");
        Duck squareDuck = new SquareDuck();
        useSquareDuck(squareDuck);
    }

    public static void useMallardDuck(Duck duck){
        duck.quack();
        duck.fly();
        duck.speak();
    }

    public static void useRounddDuck(Duck duck){
        duck.quack();
        duck.fly();
        duck.speak();
    }

    public static void useSquareDuck(Duck duck){
        duck.quack();
        duck.fly();
        duck.speak();
    }

}

interface Duck{
    public void quack();
    public void fly();
    public void speak();

}

class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Flying");
    }

    @Override
    public void speak() {
        System.out.println("Mallard Flying");
    }
}


class RoundDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("RoundDuck Quack");
    }

    @Override
    public void fly() {
        System.out.println("RoundDuck Flying");
    }

    @Override
    public void speak() {
        System.out.println("RoundDuck Flying");
    }
}

class SquareDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("SquareDuck Quack");
    }

    @Override
    public void fly() {
        System.out.println("SquareDuck Flying");
    }

    @Override
    public void speak() {
        System.out.println("SquareDuck Flying");
    }
}