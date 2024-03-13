package design_pattern.Behavioral_Patterns.Command.HeadFirstExample.ConcreteCommand;

import design_pattern.Behavioral_Patterns.Command.HeadFirstExample.Command.Command;
import design_pattern.Behavioral_Patterns.Command.HeadFirstExample.Receiver.Sterio;

public class SterioOffWithCDCommand implements Command {
    Sterio sterio;
    public SterioOffWithCDCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.off();
        sterio.setCD();
        sterio.setVolume(0);
    }

    @Override
    public void undo() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(11);
    }
}
