package com.osek.rentalapplication.domain.eventchanel;

import com.osek.rentalapplication.domain.apartment.ApartmentBooked;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomBooked;

public class EventChannel {
    public void publish(ApartmentBooked apartmentBooked) {
    }

    public void publish(HotelRoomBooked hotelRoomBooked) {
    }
}
