package com.osek.rentalapplication.domain.eventchanel;

import com.osek.rentalapplication.domain.apartment.ApartmentBooked;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomBooked;

public interface EventChannel {
    void publish(ApartmentBooked apartmentBooked);

    void publish(HotelRoomBooked hotelRoomBooked);
}
