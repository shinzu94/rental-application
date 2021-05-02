package com.osek.rentalapplication.application.apartmentbookinghistory;

import com.osek.rentalapplication.domain.apartment.ApartmentBooked;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBooking;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.osek.rentalapplication.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;
import org.springframework.context.event.EventListener;

public class ApartmentBookingHistoryEventListener {

    private ApartmentBookingHistoryRepository apartmentBookingHistoryRepository;

    public ApartmentBookingHistoryEventListener(ApartmentBookingHistoryRepository apartmentBookingHistoryRepository) {
        this.apartmentBookingHistoryRepository = apartmentBookingHistoryRepository;
    }

    @EventListener
    public void consume(ApartmentBooked apartmentBooked) {
        ApartmentBookingHistory apartmentBookingHistory = getApartmentBookingHistoryFor(apartmentBooked.getApartmentId());

        ApartmentBookingHistory.add(ApartmentBooking.start(
                apartmentBooked.getOwnerId(),
                apartmentBooked.getTenantId(),
                apartmentBooked.getPeriodStart(),
                apartmentBooked.getPeriodEnd()
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
