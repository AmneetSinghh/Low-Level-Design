package MachineCoding_HLD.Hotel_Management_System.Implementation.service.room.amountDecorator;

public class RoomCharge implements  IBaseRoomCharge {
    IBaseRoomCharge baseRoomCharge;
    int amount = 5;
    @Override
    public int getPrice() {
        System.out.println("RoomCharge::getPrice() called");
        return amount;
    }

    public void setPrice(int amount){
        this.amount = amount;
    }
}
