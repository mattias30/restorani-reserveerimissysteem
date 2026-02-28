package broneerimine.example.demo.controller;


import broneerimine.example.demo.entity.Test;
import broneerimine.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // For web requests
@RequestMapping ("/api")//
@CrossOrigin(origins = "http://localhost:8081")
public class TestController {

    @Autowired
    private TestRepository testRepository; // to use testrepo methods

    @GetMapping("/tests")
    public List<Test> fetchTest() {
        return testRepository.findAll(); //returns a list of all tests
    }

}
