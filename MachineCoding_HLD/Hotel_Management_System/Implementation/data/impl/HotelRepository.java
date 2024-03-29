package MachineCoding_HLD.Hotel_Management_System.Implementation.data.impl;

import MachineCoding_HLD.Hotel_Management_System.Implementation.data.IHotelRepository;
import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Hotel;

import java.util.ArrayList;
import java.util.List;

/*
 Singleton
*/
public class HotelRepository implements IHotelRepository {
    private static HotelRepository instance;
    private final List<Hotel> hotelList;
    private HotelRepository() {
        hotelList = new ArrayList<>(); // only once initilized.
    }
    public static HotelRepository getInstance(){
        if(instance == null){
            instance = new  HotelRepository();
        }
        return instance;
    }

    @Override
    public List<Hotel> hotelList() {
        return hotelList;
    }

    @Override
    public void add(Hotel hotel) {
        hotelList.add(hotel);
    }
}
