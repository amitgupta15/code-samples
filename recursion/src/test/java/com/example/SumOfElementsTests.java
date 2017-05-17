package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by amit on 5/16/17.
 */


public class SumOfElementsTests {

    @Test
    public void sumOfArrayElementsTest() {
        ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(4,3,6,2,8,9,3,2,8,5,1,7,2,8,3,7));
        SumOfElements sumOfElements = new SumOfElements();

        assertThat(sumOfElements.sum(data, 0)).isEqualTo(0);
        assertThat(sumOfElements.sum(data, 1)).isEqualTo(4);
        assertThat(sumOfElements.sum(data, 2)).isEqualTo(7);
        assertThat(sumOfElements.sum(data, 3)).isEqualTo(13);

    }




}
