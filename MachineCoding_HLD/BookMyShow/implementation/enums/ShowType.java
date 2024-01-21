package MachineCoding_HLD.BookMyShow.implementation.enums;

public enum ShowType {
    TWO_D("TWO_D","2D"),
    THREE_D("THREE_D","3D"),
    I_MAX("I_MAX","I_MAX");

    private final String name;
    private final String value;
    ShowType(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
