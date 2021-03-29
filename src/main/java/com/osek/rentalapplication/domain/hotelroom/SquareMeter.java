package com.osek.rentalapplication.domain.hotelroom;

import javax.persistence.Embeddable;

@Embeddable
class SquareMeter {
    private Double value;

    SquareMeter(Double value) {
        this.value = value;
    }
}
