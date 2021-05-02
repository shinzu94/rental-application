package com.osek.rentalapplication.infrastructure.eventchanel.spring;

import com.osek.rentalapplication.domain.apartment.ApartmentBooked;
import com.osek.rentalapplication.domain.eventchanel.EventChannel;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomBooked;
import org.springframework.context.ApplicationEventPublisher;

public class SpringEventChannel implements EventChannel {
    private final ApplicationEventPublisher publisher;

    public SpringEventChannel(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish(ApartmentBooked apartmentBooked) {
        publisher.publishEvent(apartmentBooked);
    }

    @Override
    public void publish(HotelRoomBooked hotelRoomBooked) {
        publisher.publishEvent(hotelRoomBooked);
    }
}
