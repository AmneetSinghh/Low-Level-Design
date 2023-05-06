package DESIGN_PATTERN.Behavioral_Patterns.Strategy;

public class DuckExample {
    public static void main(String args[]){
        Duck duck = new RubberDuck(new FlyWithWings(),new QuackNot());
        duck.quackBehavior.quack();
        duck.fly();
        // at Runtime we can change fly behavior we can use setters methods to change the flying behaviour.
    }
}

// we can pass different quack and fly Strategy to different ducks at runtime using factories.


class Duck{
    public Duck(Flybehavior flybehavior, QuackBehavior quackBehavior){
        this.flybehavior = flybehavior;
        this.quackBehavior = quackBehavior;
    }
    Flybehavior flybehavior;
    QuackBehavior quackBehavior;

    public void fly(){
        flybehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
}
class RubberDuck extends  Duck{

    public RubberDuck(Flybehavior flybehavior, QuackBehavior quackBehavior) {
        super(flybehavior, quackBehavior);
    }

   public void fly(){
        System.out.println("This runs parent not");
        flybehavior.fly();
   }
}
class SimpleDuck extends  Duck{

    public SimpleDuck(Flybehavior flybehavior, QuackBehavior quackBehavior) {
        super(flybehavior, quackBehavior);
    }
}


interface Flybehavior{
    public void fly();
}

class FlyWithWings implements Flybehavior{

    @Override
    public void fly() {
        System.out.println("Fly with wings");

    }
}
class FlyWithWingsNot implements Flybehavior{

    @Override
    public void fly() {
        System.out.println("Fly with wings not");

    }
}

interface QuackBehavior{
    public void quack();
}

class QuackWith implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack with");
    }
}
class QuackNot implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack not");
    }
}