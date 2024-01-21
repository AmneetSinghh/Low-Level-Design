package MachineCoding_HLD.BookMyShow.implementation.util;

public class Utils {

    public static String joinKey(int one,int two){
        String f = String.valueOf(one);
        String s = String.valueOf(two);
        return f+"_"+s;
    }
    public static String joinKey(int one,int two, String three){
        String f = String.valueOf(one);
        String s = String.valueOf(two);
        return f+"_"+s+"_"+three;
    }
}
