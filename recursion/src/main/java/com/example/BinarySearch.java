package com.example;

import java.util.ArrayList;

/**
 * Created by amit on 5/10/17.
 */
public class BinarySearch {

    public int search(ArrayList<Integer> data, Integer searchValue) {
        return binarySearch(data, searchValue, 0, data.size() - 1);
    }

    private int binarySearch(ArrayList<Integer> data, Integer searchValue, int lowIndex, int highIndex) {
        if(lowIndex > highIndex) return -1;
        int median = (lowIndex + highIndex) / 2;
        if(searchValue == data.get(median)) {
            return median;
        } else if(searchValue > data.get(median)) {
            return binarySearch(data, searchValue, median + 1, highIndex);
        } else {
            return binarySearch(data, searchValue, lowIndex, median -1);
        }
    }
}
