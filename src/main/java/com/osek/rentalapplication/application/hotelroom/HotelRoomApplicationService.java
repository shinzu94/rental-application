package com.osek.rentalapplication.application.hotelroom;

import com.osek.rentalapplication.domain.hotelroom.HotelRoom;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {

    public void add(String hotelId, int number, Map<String, Double> spacesDefinition, String description){
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition, description);
    }
}
