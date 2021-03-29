package com.osek.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.osek.rentalapplication.domain.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface SpringJpaHotelRepository extends CrudRepository<Hotel, String> {
}
