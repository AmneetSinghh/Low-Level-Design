package DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Receiver.Sterio;

public class SterioOnWithCDCommand implements Command {
    Sterio sterio;
    public SterioOnWithCDCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(11);
    }

    @Override
    public void undo() {
        sterio.off();
        sterio.setCD();
        sterio.setVolume(0);
    }
}