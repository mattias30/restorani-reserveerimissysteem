package broneerimine.example.demo.controller;


import broneerimine.example.demo.entity.Test;
import broneerimine.example.demo.repository.TestRepository;
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
public class TestController {

    @Autowired
    private TestRepository testRepository; // to use testrepo methods

    /**
     * Method to get random booked tables.
     * @return List of random tables which are booked.
     */
    @GetMapping("/tests")
    public List<Test> fetchTest() {
        List<Test> allTables = testRepository.findAll(); //returns a list of all tests
        Collections.shuffle(allTables);
        int i = (int) Math.round(Math.random()*allTables.size());

        List<Test> randomTables = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            randomTables.add(allTables.get(j));
        }
        return randomTables;
    }

}
