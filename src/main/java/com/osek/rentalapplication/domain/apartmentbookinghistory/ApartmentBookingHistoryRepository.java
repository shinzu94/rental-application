package com.osek.rentalapplication.domain.apartmentbookinghistory;

public interface ApartmentBookingHistoryRepository {
    boolean existFor(String apartmentId);
    ApartmentBookingHistory findFor(String apartmentId);
}
