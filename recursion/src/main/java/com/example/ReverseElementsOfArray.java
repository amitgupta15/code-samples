package com.example;

import java.util.ArrayList;

/**
 * Created by amit on 5/17/17.
 */
public class ReverseElementsOfArray {

    public ArrayList<Integer> reverse(ArrayList<Integer> data, int low, int high) {
        if(low < high) {
            int temp = data.get(low);
            data.set(low, data.get(high));
            data.set(high, temp);
            reverse(data, low + 1, high - 1);
        }
        return data;
    }
}
