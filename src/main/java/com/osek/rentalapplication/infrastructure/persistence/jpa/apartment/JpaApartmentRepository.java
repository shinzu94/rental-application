package com.osek.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.osek.rentalapplication.domain.apartment.Apartment;
import com.osek.rentalapplication.domain.apartment.ApartmentRepository;

public class JpaApartmentRepository implements ApartmentRepository {
    private final SpringJpaApartmentRepository springJpaApartmentRepository;

    public JpaApartmentRepository(SpringJpaApartmentRepository springJpaApartmentRepository) {
        this.springJpaApartmentRepository = springJpaApartmentRepository;
    }

    @Override
    public void save(Apartment apartment) {
        springJpaApartmentRepository.save(apartment);
    }
}
