package DESIGN_PATTERN.Behavioral_Patterns.Chain_Of_Responsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);// calling the super for changing its NextLogProcessor
        // so we have to call the next log processor for changing the object/variable name for its instance.
    }

    public void log(int logLevel,String message){
        if(logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else{
            super.log(logLevel, message);
        }
    }


}
