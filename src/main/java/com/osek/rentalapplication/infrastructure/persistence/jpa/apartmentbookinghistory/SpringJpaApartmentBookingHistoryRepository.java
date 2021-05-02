package com.osek.rentalapplication.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaApartmentBookingHistoryRepository extends CrudRepository<ApartmentBookingHistory, String> {
}
