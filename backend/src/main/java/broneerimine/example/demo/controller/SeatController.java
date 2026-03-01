package broneerimine.example.demo.controller;


import broneerimine.example.demo.entity.Seat;
import broneerimine.example.demo.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController  // For web requests
@RequestMapping ("/api")//
@CrossOrigin(origins = "http://localhost:8081")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository; // to use testrepo methods

    /**
     * Method to get random booked tables.
     * @return List of random tables which are booked.
     */
    @GetMapping("/seats")
    public List<Seat> fetchSeats() {  // fetches booked
        return seatRepository.findAll();
    }

}
