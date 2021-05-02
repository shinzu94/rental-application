package com.osek.rentalapplication.infrastructure.rest.api.hotelroom;

import com.osek.rentalapplication.application.hotelroom.HotelRoomApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotelroom")
public class HotelRoomRestController {
    private final HotelRoomApplicationService hotelRoomApplicationService;

    public HotelRoomRestController(HotelRoomApplicationService hotelRoomApplicationService) {
        this.hotelRoomApplicationService = hotelRoomApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelRoomDto hotelRoomDto) {
        hotelRoomApplicationService.add(
                hotelRoomDto.getHotelId(),
                hotelRoomDto.getNumber(),
                hotelRoomDto.getSpacesDefinition(),
                hotelRoomDto.getDescription()
        );
    }

    @PutMapping("/book/{id}")
    public void book(@PathVariable String id, @RequestBody HotelBookingDto hotelBookingDto) {
        hotelRoomApplicationService.book(id, hotelBookingDto.getTenantId(), hotelBookingDto.getDays());
    }
}
