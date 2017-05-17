package com.example;

/**
 * Created by amit on 5/17/17.
 */
public class ComputePower {

    public int simpleCompute(int number, int power) {

        if(power == 0) {
            return 1;
        } else {
            return number * simpleCompute(number, power - 1);
        }
    }

    public int optimizedCompute(int number, int power) {

        if(power == 0) {
            return 1;
        } else if(power % 2 == 0){
            return optimizedCompute(number, power/2) * optimizedCompute(number, power/2);
        } else {
            return optimizedCompute(number, power/2) * optimizedCompute(number, power/2) * number;
        }
    }
}
