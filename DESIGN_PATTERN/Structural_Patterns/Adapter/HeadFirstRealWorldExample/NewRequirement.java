package DESIGN_PATTERN.Structural_Patterns.Adapter.HeadFirstRealWorldExample;

// you can see we didn't changed anything who uses the duck functions.
// we just made the adapter, and we just changed the object creation.

// The power of adapter design pattern.
public class NewRequirement {

}


// So now we have to adapt.
interface Turkey{
    public void gooble();
    public void fly();
    // it doesn't support speak
}

class Mallardturkey implements Turkey {

    @Override
    public void gooble() {
        System.out.println("Mallardturkey gooble");
    }

    @Override
    public void fly() {
        System.out.println("Mallardturkey fly");
    }
}

class Roundturkey implements Turkey {

    @Override
    public void gooble() {
        System.out.println("Roundturkey gooble");
    }

    @Override
    public void fly() {
        System.out.println("Roundturkey fly");
    }
}

class Squareturkey implements Turkey {

    @Override
    public void gooble() {
        System.out.println("Squareturkey gooble");
    }

    @Override
    public void fly() {
        System.out.println("Squareturkey fly");
    }
}