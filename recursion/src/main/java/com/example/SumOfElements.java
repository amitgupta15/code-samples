package com.example;

import java.util.ArrayList;

/**
 * Created by amit on 5/17/17.
 */
public class SumOfElements {


    public int sum(ArrayList<Integer> array, int numberOfElements) {
        if(numberOfElements == 0) {
            return 0;
        } else {
            return array.get(numberOfElements - 1) + sum(array, numberOfElements - 1);
        }
    }
}
