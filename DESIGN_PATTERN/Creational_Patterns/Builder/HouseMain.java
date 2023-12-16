package DESIGN_PATTERN.Creational_Patterns.Builder;

public class HouseMain {
    public void method(){
        PhoneRecharge p = new PhoneRecharge.Builder().setContactId("sdf").build();
        // builder pattern.H
        House house = new House.HouseBuilder().setFans("sdf").build();
    }
}
