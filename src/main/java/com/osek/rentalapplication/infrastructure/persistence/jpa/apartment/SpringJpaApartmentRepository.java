package com.osek.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.osek.rentalapplication.domain.apartment.Apartment;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaApartmentRepository extends CrudRepository<Apartment, String> {
}
