package com.osek.rentalapplication.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;

public class JpaApartmentBookingHistoryRepository implements com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository {
    private final SpringJpaApartmentBookingHistoryRepository springJpaApartmentBookingHistoryRepository;

    public JpaApartmentBookingHistoryRepository(SpringJpaApartmentBookingHistoryRepository springJpaAparmentBookingHistoryRepository) {
        this.springJpaApartmentBookingHistoryRepository = springJpaAparmentBookingHistoryRepository;
    }

    @Override
    public boolean existFor(String apartmentId) {
        return springJpaApartmentBookingHistoryRepository.existsById(apartmentId);
    }

    @Override
    public ApartmentBookingHistory findFor(String apartmentId) {
        return springJpaApartmentBookingHistoryRepository.findById(apartmentId).get();
    }

    @Override
    public void save(ApartmentBookingHistory apartmentBookingHistory) {
        springJpaApartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }
}
