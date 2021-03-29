package com.osek.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.osek.rentalapplication.domain.hotelroom.HotelRoom;
import com.osek.rentalapplication.domain.hotelroom.HotelRoomRepository;

public class JpaHotelRoomRepository implements HotelRoomRepository {
    private final SpringJpaHotelRoomRepository springJpaHotelRoomRepository;

    public JpaHotelRoomRepository(SpringJpaHotelRoomRepository springJpaHotelRoomRepository) {
        this.springJpaHotelRoomRepository = springJpaHotelRoomRepository;
    }

    @Override
    public void save(HotelRoom hotelRoom) {
        springJpaHotelRoomRepository.save(hotelRoom);
    }
}
