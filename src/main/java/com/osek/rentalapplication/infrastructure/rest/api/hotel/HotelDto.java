package com.osek.rentalapplication.infrastructure.rest.api.hotel;

public class HotelDto {
    String name;
    String street;
    String postalCode;
    String buildingNumber;
    String city;
    String country;

    public HotelDto(String name, String street, String postalCode, String buildingNumber, String city, String country) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
