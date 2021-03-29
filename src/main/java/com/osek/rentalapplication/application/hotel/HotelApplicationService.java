package com.osek.rentalapplication.application.hotel;

import com.osek.rentalapplication.domain.hotel.Address;
import com.osek.rentalapplication.domain.hotel.Hotel;

public class HotelApplicationService {
    public void add(String name, String street, String postalCode, String buildingNumber, String city, String country) {
        Address address = new Address(street, postalCode, buildingNumber, city, country);
        Hotel hotel = new Hotel(name, address);
    }
}
