package design_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TrasactionType {
    SENT_PAYMENT(1,"SENT_PAYMENT"),
    RECEIVE_PAYMENT(2,"RECEIVE_PAYMENT");
    int key;
    String value;
    TrasactionType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }
    public String getValue(){
        return value;
    }

    public static List<TrasactionType> getAllTransactionTypes() {
        return new ArrayList<>(Arrays.asList(values()));
    }
}




class Main{
    public static void main(String[] args) {
        List<TrasactionType> vals = TrasactionType.getAllTransactionTypes();
        for(TrasactionType val : vals){
            System.out.println(val.getKey() + " value-> "+ val.getValue());
        }
    }
}