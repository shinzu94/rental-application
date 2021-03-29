package com.osek.rentalapplication.domain.hotel;

public class Hotel {
    private final String name;
    private final Address address;

    public Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
