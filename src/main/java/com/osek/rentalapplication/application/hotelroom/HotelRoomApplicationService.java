package com.osek.rentalapplication.application.hotelroom;

import com.osek.rentalapplication.domain.hotelroom.HotelRepository;
import com.osek.rentalapplication.domain.hotelroom.HotelRoom;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {
    private final HotelRepository hotelRepository;

    public HotelRoomApplicationService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void add(String hotelId, int number, Map<String, Double> spacesDefinition, String description){
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition, description);
        hotelRepository.save(hotelRoom);
    }
}
