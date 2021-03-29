package com.osek.rentalapplication.application.hotelroom;

import com.osek.rentalapplication.domain.hotelroom.HotelRoom;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomFactory;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomRepository;

import java.util.Map;

public class HotelRoomApplicationService {
    private final HotelRoomRepository hotelRoomRepository;

    public HotelRoomApplicationService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public void add(String hotelId, int number, Map<String, Double> spacesDefinition, String description){
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition, description);
        hotelRoomRepository.save(hotelRoom);
    }
}
