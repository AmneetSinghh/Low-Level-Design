package design_patterns.Command_Pattern;
import design_patterns.Command_Pattern.Command.Command;
import design_patterns.Command_Pattern.ConcreteCommand.*;
import design_patterns.Command_Pattern.Invoker.RemoteControl;
import design_patterns.Command_Pattern.Receiver.CeilingFan;
import design_patterns.Command_Pattern.Receiver.Light;
import design_patterns.Command_Pattern.Receiver.Sterio;

import java.rmi.Remote;

public class Client {

    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl();// this is the invoker.
        Light light = new Light();
        Sterio sterio = new Sterio();
        CeilingFan ceilingFan = new CeilingFan();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        SterioOnWithCDCommand sterioOnWithCDCommand = new SterioOnWithCDCommand(sterio);
        SterioOffWithCDCommand sterioOffWithCDCommand = new SterioOffWithCDCommand(sterio);

        // Macro commmand;
        Command[] partyOn = {lightOnCommand,sterioOnWithCDCommand,ceilingFanHighCommand};
        Command[] partyOff = {lightOffCommand,sterioOffWithCDCommand,ceilingFanHighCommand};
        // now we have got all the commands, we can load them into the remote slots.

        MacroCommand macroCommandOnn = new MacroCommand(partyOn);
        MacroCommand macroCommandOff = new MacroCommand(partyOff);




        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,sterioOnWithCDCommand,sterioOffWithCDCommand);
        remoteControl.setCommand(2,ceilingFanHighCommand,ceilingFanHighCommand);// in the off slot ceiling fan off command.
        remoteControl.setCommand(3,macroCommandOnn,macroCommandOff);// in the off slot ceiling fan off command.

        System.out.println(remoteControl);

        remoteControl.onButtonClicked(0);
        remoteControl.onButtonClicked(1);
        remoteControl.offButtonClicked(1);
        remoteControl.offButtonClicked(0);
        remoteControl.onButtonClicked(2);
        remoteControl.undoButtonWasPressed();

        System.out.println("Party on switch");
        remoteControl.onButtonClicked(3);
        System.out.println("Party off switch");
        remoteControl.offButtonClicked(3);

        System.out.println(" Pressing ********* UNdo ****** Command");
        remoteControl.undoButtonWasPressed();

    }



}
