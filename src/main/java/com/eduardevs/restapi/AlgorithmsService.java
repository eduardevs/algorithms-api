package com.eduardevs.restapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgorithmsService {

    public boolean getBinarySearchOf(List<Integer> array, int needle) {
        BinarySearch binarySearch = new BinarySearch();
        boolean result = binarySearch.of(array, needle);
        return result;
    }
}
