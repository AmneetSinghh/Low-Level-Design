package design_patterns.ChainOfResponsibilityDesignPattern;

public class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        if(nextLogProcessor!=null){
            System.out.println("Logprocessor is : "+ nextLogProcessor.getClass().getSimpleName());
        }
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String logMessage){
        if(nextLogProcessor!=null){
            System.out.println("***** Entering LogProcesssor wiht NextLogProcessor is : "+ nextLogProcessor.getClass().getSimpleName());
            nextLogProcessor.log(logLevel,logMessage);// passing the responsibility to the next Level log processor.
        }
        else{
            System.out.println("No next Level Present");
        }
    }
}

