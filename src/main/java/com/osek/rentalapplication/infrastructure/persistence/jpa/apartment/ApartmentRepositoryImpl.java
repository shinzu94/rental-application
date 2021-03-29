package com.osek.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.osek.rentalapplication.domain.apartment.Apartment;
import com.osek.rentalapplication.domain.apartment.ApartmentRepository;

public class ApartmentRepositoryImpl implements ApartmentRepository {
    private final SpringJpaApartmentRepository springJpaApartmentRepository;

    public ApartmentRepositoryImpl(SpringJpaApartmentRepository springJpaApartmentRepository) {
        this.springJpaApartmentRepository = springJpaApartmentRepository;
    }

    @Override
    public void save(Apartment apartment) {
        springJpaApartmentRepository.save(apartment);
    }
}
