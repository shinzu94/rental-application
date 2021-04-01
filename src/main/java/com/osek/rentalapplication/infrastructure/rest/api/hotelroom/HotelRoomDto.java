package com.osek.rentalapplication.infrastructure.rest.api.hotelroom;

import java.util.Map;

public class HotelRoomDto {
    String hotelId;
    int number;
    Map<String, Double> spacesDefinition;
    String description;

    public HotelRoomDto(String hotelId, int number, Map<String, Double> spacesDefinition, String description) {
        this.hotelId = hotelId;
        this.number = number;
        this.spacesDefinition = spacesDefinition;
        this.description = description;
    }

    public String getHotelId() {
        return hotelId;
    }

    public int getNumber() {
        return number;
    }

    public Map<String, Double> getSpacesDefinition() {
        return spacesDefinition;
    }

    public String getDescription() {
        return description;
    }
}
