package com.learningspring.ll.learningspring.webservice;

import com.learningspring.ll.learningspring.business.ReservationService;
import com.learningspring.ll.learningspring.business.RoomReservation;
import com.learningspring.ll.learningspring.data.Reservation;
import com.learningspring.ll.learningspring.util.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebServiceController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebServiceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations",method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date",required = false) String dateString){
        Date date =  this.dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> reservationList = this.reservationService.getRoomReservationsForDate(date);
        return  reservationList;

    }

}
