package com.example.bigbowlxp.controllers;

import com.example.bigbowlxp.models.Booking;
import com.example.bigbowlxp.services.BookingService;
import com.example.bigbowlxp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    CustomerService customerService;

    @GetMapping("/bookings")
    public String getAllBookings(Model model){
        List<Booking> bookingList = bookingService.fetchAllBookings();
        model.addAttribute("bookings", bookingList);
        return "bookings";
    }

    @GetMapping("/bookings/{id}")
    public String fetchBookingById(@PathVariable int id, Model model){
        Booking booking = bookingService.fetchBookingById(id);
        model.addAttribute("booking", booking);
        return "booking";
    }

    @GetMapping("/createBooking")
    public String createBooking(){
        return "createBooking";
    }


    @PostMapping("/bookings")
    public String createBooking(@ModelAttribute Booking booking){
        bookingService.createBooking(booking);
        return "redirect:/bookings";
    }

    @GetMapping("/deleteBooking/{id}")
    public String deleteBooking(@PathVariable int id){
        bookingService.deleteBooking(id);
        bookingService.deleteJoinedBooking(id);
        return
    }

}