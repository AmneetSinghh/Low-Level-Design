package DESIGN_PATTERN.Structural_Patterns.Adapter.HeadFirstRealWorldExample;

public class NewCode {
        public static void main(String args[]){
            Duck turkeyMallardAdapter = new TurkeyMallardAdapter(new Mallardturkey());
            useMallardDuck(turkeyMallardAdapter);
            System.out.println("----------------------------");
            Duck turkeyRounddAdapter = new TurkeyRounddAdapter(new Roundturkey());
            useRounddDuck(turkeyRounddAdapter);
        }


        // we haven't changed these functions.
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
}

class TurkeyMallardAdapter implements Duck {

    Turkey turkey;
    public TurkeyMallardAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void speak() {
//        throw new UnsupportedOperationException("Speak not accessible, because new interface turkey doesn't support it");
    }
}

class TurkeyRounddAdapter implements Duck {

    Turkey turkey;
    public TurkeyRounddAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void speak() {
//        throw new UnsupportedOperationException("Speak not accessible, because new interface turkey doesn't support it");
    }
}
