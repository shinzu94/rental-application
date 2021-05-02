package com.osek.rentalapplication.domain.apartmentbookinghistory;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ApartmentBooking {
    private BookingStep bookingStep;
    private LocalDateTime bookingDateTime;
    private String ownerId;
    private String tenantId;
    @Embedded
    private BookingPeriod bookingPeriod;
    @Id
    private String id;

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
        this.id = UUID.randomUUID().toString();
    }

    public ApartmentBooking() {

    }

    public ApartmentBooking start(LocalDateTime bookingDateTime,
                                         String ownerId,
                                         String tenantId,
                                         BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START, bookingDateTime, ownerId, tenantId, bookingPeriod);
    }
}
