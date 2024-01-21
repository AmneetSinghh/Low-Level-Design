package MachineCoding_HLD.Hotel_Management_System.Implementation.data;

import MachineCoding_HLD.Hotel_Management_System.Implementation.model.Hotel;

import java.util.List;

public interface IHotelRepository {
    public List<Hotel> hotelList();
    public void add(Hotel hotel);
}
