package DESIGN_PATTERN.Behavioral_Patterns.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);// calling the super
    }

    public void log(int logLevel,String message){
        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}
