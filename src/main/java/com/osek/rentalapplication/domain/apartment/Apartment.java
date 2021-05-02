package com.osek.rentalapplication.domain.apartment;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartment {
    @Id
    @GeneratedValue
    private String id;

    private final String ownerId;
    @Embedded
    private final Address address;
    @OneToMany
    private final List<Room> rooms;
    private final String description;

    Apartment(String ownerId, Address address, List<Room> rooms, String description) {
        this.ownerId = ownerId;
        this.address = address;
        this.rooms = rooms;
        this.description = description;
    }

    public void book(String tenantId, Period period) {
        new ApartmentBooked apartmentBooked = ApartmentBooked.create(id, ownerId, tenantId, period);
    }
}
