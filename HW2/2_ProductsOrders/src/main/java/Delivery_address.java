import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Delivery_address {//Create a delivery address class (consists of fields country, city, street, house, floor, apartment).
    //
    public String country, city, street;
    public int house, floor, flat;

    public Delivery_address() {
        //empyt class constructor
    }

    public Delivery_address(String country, String city, String street, int house, int floor, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.floor = floor;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Delivery_address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + house +
                ", level=" + floor +
                ", room=" + flat +
                '}';
    }
}