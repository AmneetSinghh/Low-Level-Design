package design_pattern.Behavioral_Patterns.Chain_Of_Responsibility;

//https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch06s01.html#:~:text=A%20class%20in%20Java%20can,%7B%20float%20weight%20%3B%20...
// we are using the shadow variables, so info log processor have proper instance of log processor, it means, it has its own log processor all its methods and variables.
public class Main {
    public static void main(String args[]){
        // it's a chain of responsibilities.
        LogProcessor logger = new InfoLogProcessor(   // level - 1 check
                    new DebugLogProcessor( // level - 2 check
                            new ErrorLogProcessor(  // level - 3 check
                                    null)));


//        logger.log(LogProcessor.ERROR, "exception happens");
//        logger.log(LogProcessor.DEBUG, "need to debug this ");
//        logger.log(LogProcessor.LogProcessorINFO, "just for info ");
    }
}
