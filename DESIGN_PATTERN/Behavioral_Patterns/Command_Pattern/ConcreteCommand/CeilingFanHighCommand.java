package DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.Receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanHighCommand (CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }
        if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }
        if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }
        if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
