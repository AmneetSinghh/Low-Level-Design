package DESIGN_PATTERN.Behavioral_Patterns.Command.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.Receiver.Sterio;

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
