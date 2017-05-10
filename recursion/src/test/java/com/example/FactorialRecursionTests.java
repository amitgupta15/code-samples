package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by amit on 5/10/17.
 */
public class FactorialRecursionTests {

    @Test(expected = IllegalArgumentException.class)
    public void factorialIllegalArgTest() {
        SimpleRecursion simpleRecursion = new SimpleRecursion();
        simpleRecursion.factorial(-10);
    }

    @Test
    public void factorialTest() {
        SimpleRecursion simpleRecursion = new SimpleRecursion();
        assertThat(simpleRecursion.factorial(0)).isEqualTo(1);
        assertThat(simpleRecursion.factorial(4)).isEqualTo(24);
        assertThat(simpleRecursion.factorial(5)).isEqualTo(120);
        assertThat(simpleRecursion.factorial(6)).isEqualTo(720);
    }
}

