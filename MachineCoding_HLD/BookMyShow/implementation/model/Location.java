package MachineCoding_HLD.BookMyShow.implementation.model;

public class Location {
    private String city;
    private String pincode;

    public Location(String city, String pincode, String state, String country) {
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String state;
    private String country;
}
