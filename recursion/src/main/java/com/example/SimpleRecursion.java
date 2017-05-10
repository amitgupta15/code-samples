package com.example;

/**
 * Created by amit on 5/10/17.
 */
public class SimpleRecursion {

    public int factorial(int n) throws IllegalArgumentException {
        if(n < 0) throw new IllegalArgumentException();

        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
