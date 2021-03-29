package com.osek.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.osek.rentalapplication.domain.hotelroom.HotelRoom;
import org.springframework.data.repository.CrudRepository;

public interface SpringJpaHotelRoomRepository extends CrudRepository<HotelRoom, String> {
}
