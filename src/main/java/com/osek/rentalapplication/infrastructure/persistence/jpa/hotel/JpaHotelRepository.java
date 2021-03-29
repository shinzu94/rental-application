package com.osek.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.osek.rentalapplication.domain.hotel.Hotel;
import com.osek.rentalapplication.domain.hotel.HotelRepository;

public class JpaHotelRepository implements HotelRepository {
    private final SpringJpaHotelRepository springJpaHotelRepository;

    public JpaHotelRepository(SpringJpaHotelRepository springJpaHotelRepository) {
        this.springJpaHotelRepository = springJpaHotelRepository;
    }

    @Override
    public void save(Hotel hotel) {
        springJpaHotelRepository.save(hotel);
    }
}
