package LLD.Logging_Service;
// used chain of responsiblity pattern


public class LoggerDriver(){
    public static void main(String args[]){
        LogProcessor logger = new InfoLogProcessor ( new DebugLogProcessor( new ErrorLogProcessor( null )));
        logger.log(logger.ERROR, "Exception happens");
        logger.log(logger.DEBUG, "debug happens");
        logger.log(logger.INFO, "info happens");

    }
}


