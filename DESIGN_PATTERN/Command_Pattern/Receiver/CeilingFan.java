package DESIGN_PATTERN.Command_Pattern.Receiver;

// Main objects that person the action.
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    public CeilingFan(){
        speed = OFF;
        System.out.println("Ceiling Fan Speed is OFF Initially");
    }
    public void high(){
        speed = HIGH;
        System.out.println("Ceiling Fan Speed is HIGH");

    }
    public void medium(){
        speed = MEDIUM;
        System.out.println("Ceiling Fan Speed is MEDIUM");

    }
    public void low(){
        speed = LOW;
        System.out.println("Ceiling Fan Speed is LOW");

    }
    public void off(){
        speed = OFF;
        System.out.println("Ceiling Fan Speed is OFF");

    }

    public int speed(){
        return speed;
    }


}
