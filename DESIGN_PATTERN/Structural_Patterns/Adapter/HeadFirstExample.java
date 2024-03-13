package design_pattern.Structural_Patterns.Adapter;

// It converts one interface to another.
public class HeadFirstExample {
    public static void main(String args[]){
        Duck duck = new mallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();

        System.out.println("---------------------------------------------------------");
        turkey.gooble();
        turkey.fly();

        System.out.println("---------------------------------------------------------");

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

// we have existing code that uses a duck interface.

interface Duck{
    public void quack();
    public void fly();
}

class mallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}


// new requirement.
// new interface now we have to adapt to this one.
 interface Turkey{
    public void gooble();
    public void fly();// fly 5 times slower than duck.
}

class WildTurkey implements Turkey{

    @Override
    public void gooble() {
        System.out.println("gooble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying short distance.");
    }
}

// adapter.
class TurkeyAdapter implements Duck{

    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}