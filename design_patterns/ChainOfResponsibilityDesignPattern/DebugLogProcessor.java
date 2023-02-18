package design_patterns.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);// calling the super
    }

    public void log(int logLevel,String message){
        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}

