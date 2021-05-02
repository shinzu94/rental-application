package com.osek.rentalapplication.domain.apartmentbookinghistory;

import java.time.LocalDateTime;

public class ApartmentBooking {
    private BookingStep bookingStep;
    private LocalDateTime bookingDateTime;
    private String ownerId;
    private String tenantId;
    private BookingPeriod bookingPeriod;

    private ApartmentBooking(BookingStep bookingStep,
                             LocalDateTime bookingDateTime,
                             String ownerId,
                             String tenantId,
                             BookingPeriod bookingPeriod) {
        this.bookingStep = bookingStep;
        this.bookingDateTime = bookingDateTime;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
    }

    public static ApartmentBooking start(LocalDateTime bookingDateTime,
                                         String ownerId,
                                         String tenantId,
                                         BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START, bookingDateTime, ownerId, tenantId, bookingPeriod);
    }
}
