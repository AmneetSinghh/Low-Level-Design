package DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Receiver;

public class Sterio {
    int volume;
    public void on(){
        System.out.println("Sterio on");
    }
    public void off(){
        System.out.println("Sterio off");
    }
    public void setCD(){
        System.out.println("CD is setted");
    }

    public void unsetCD(){
        System.out.println("unset the CD");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume of sterio is set :"+ this.volume);
    }
}
