package com.osek.rentalapplication.domain.apartmentbookinghistory;

public class ApartmentBooking {
    private BookingStep bookingStep;
    private String ownerId;
    private String tenantId;
    private BookingPeriod bookingPeriod;

    private ApartmentBooking(BookingStep bookingStep, String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        this.bookingStep = bookingStep;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
    }

    public static ApartmentBooking start(String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START, ownerId, tenantId, bookingPeriod);
    }
}
