package com.osek.rentalapplication.infrastructure.rest.api.apartment;

import org.springframework.web.bind.annotation.*;
import com.osek.rentalapplication.application.apartment.ApartmentApplicationService;

@RestController
@RequestMapping("/aparment")
public class ApartmentRestController {
    private final ApartmentApplicationService apartmentApplicationService;

    public ApartmentRestController(ApartmentApplicationService apartmentApplicationService) {
        this.apartmentApplicationService = apartmentApplicationService;
    }

    @PostMapping
    public void add(@RequestBody ApartmentDto apartmentDto) {
        apartmentApplicationService.add(
                apartmentDto.getOwnerId(),
                apartmentDto.getStreet(),
                apartmentDto.getPostalCode(),
                apartmentDto.getHouseNumber(),
                apartmentDto.getApartmentNumber(),
                apartmentDto.getCity(),
                apartmentDto.getCountry(),
                apartmentDto.getDescription(),
                apartmentDto.getRoomsDefinition()
        );
    }

    @PutMapping("/book/{id}")
    public void book(@PathVariable String id, @RequestBody ApartmentBookingDto apartmentBookingDto) {
        apartmentApplicationService.book(
                id,
                apartmentBookingDto.getTenantId(),
                apartmentBookingDto.getStart(),
                apartmentBookingDto.getEnd()
        );
    }
}
