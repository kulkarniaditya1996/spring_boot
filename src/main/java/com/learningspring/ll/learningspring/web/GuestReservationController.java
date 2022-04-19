package com.learningspring.ll.learningspring.web;

import com.learningspring.ll.learningspring.business.ReservationService;
import com.learningspring.ll.learningspring.data.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestReservationController {

    private final ReservationService reservationService;

    public GuestReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String getAllGuests(Model model){
        List<Guest> guestList = this.reservationService.getHotelGuests();
        model.addAttribute("guestList",guestList);
        return "guestres";
    }
}
