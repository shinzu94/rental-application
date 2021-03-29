package com.osek.rentalapplication.application.hotel;

import com.osek.rentalapplication.domain.hotel.Hotel;
import com.osek.rentalapplication.domain.hotel.HotelFactory;

public class HotelApplicationService {
    public void add(String name, String street, String postalCode, String buildingNumber, String city, String country) {
        Hotel hotel = new HotelFactory().create(name, street, postalCode, buildingNumber, city, country);
    }
}
