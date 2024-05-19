package com.eduardevs.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlgorithmsController {
    AlgorithmsService algorithmsService;

    public AlgorithmsController(AlgorithmsService algorithmsService) {
        this.algorithmsService = algorithmsService;
    }

    static List<Integer> generateArray(int start, int end) {
        List<Integer> listNumbers = new ArrayList<>();

        for(int i = start; i <= end; i++) {
            listNumbers.add(i);
        }
        return listNumbers;
    }
    @GetMapping(path="/")
    public String getHome() {
        return "Welcome to algorithm api !";
    }

    // by moment default array is from 1 to 100
    @GetMapping(path = "/binarySearch/{needle}")
    public boolean binarySearch(@PathVariable("needle") int needle) {
        //
        List<Integer> listNumbers = generateArray(1, 100);

        //return listNumbers.toString();
        return algorithmsService.getBinarySearchOf(listNumbers, needle);
    }
}
