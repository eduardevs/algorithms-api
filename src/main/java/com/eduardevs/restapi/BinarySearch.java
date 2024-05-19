package com.eduardevs.restapi;

import java.util.List;

public class BinarySearch {
    public boolean of(List<Integer> array, int needle){
        int low = 0;
        int high = array.size();

        do {
            int half = (int) Math.floor(low + (high - low)/2);
            int value = array.get(half);
            if(needle == value) {
                return true;
            } else if(value > needle) {
                high = half;
            } else {
                low = half+1;
            }

        } while(low < high);

        return false;
    }
}
