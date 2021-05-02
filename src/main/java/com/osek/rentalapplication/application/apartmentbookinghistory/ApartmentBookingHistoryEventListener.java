package com.osek.rentalapplication.application.apartmentbookinghistory;

import com.osek.rentalapplication.domain.apartment.ApartmentBooked;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBooking;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;
import com.osek.rentalapplication.domain.apartmentbookinghistory.BookingPeriod;
import org.springframework.context.event.EventListener;

public class ApartmentBookingHistoryEventListener {

    private ApartmentBookingHistoryRepository apartmentBookingHistoryRepository;

    public ApartmentBookingHistoryEventListener(ApartmentBookingHistoryRepository apartmentBookingHistoryRepository) {
        this.apartmentBookingHistoryRepository = apartmentBookingHistoryRepository;
    }

    @EventListener
    public void consume(ApartmentBooked apartmentBooked) {
        ApartmentBookingHistory apartmentBookingHistory = getApartmentBookingHistoryFor(apartmentBooked.getApartmentId());
        BookingPeriod bookingPeriod = new BookingPeriod(apartmentBooked.getPeriodStart(), apartmentBooked.getPeriodEnd());

        ApartmentBookingHistory.add(ApartmentBooking.start(
                apartmentBooked.getEventCreationDateTime(),
                apartmentBooked.getOwnerId(),
                apartmentBooked.getTenantId(),
                bookingPeriod
        ));

        apartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }

    private ApartmentBookingHistory getApartmentBookingHistoryFor(String apartmentId) {
        if (apartmentBookingHistoryRepository.existFor(apartmentId)) {
            return apartmentBookingHistoryRepository.findFor(apartmentId);
        } else {
            return new ApartmentBookingHistory(apartmentId);
        }
    }
}
