package com.example;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static  org.assertj.core.api.Assertions.*;

/**
 * Created by amit on 5/17/17.
 */
public class ReverseElementsOfArrayTests {

    @Test
    public void reverseElementsTest() {
        ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(4,3,6,2,8,9,3,2,8,5,1,7,2,8,3,7));

        ReverseElementsOfArray reverseElements = new ReverseElementsOfArray();

        ArrayList<Integer> reversedArray = reverseElements.reverse(data, 0, data.size() - 1);
        assertThat(reversedArray.get(0)).isEqualTo(7);
        assertThat(reversedArray.get(1)).isEqualTo(3);
        assertThat(reversedArray.get(2)).isEqualTo(8);
        assertThat(reversedArray.get(3)).isEqualTo(2);
        assertThat(reversedArray.get(4)).isEqualTo(7);
        assertThat(reversedArray.get(5)).isEqualTo(1);
        assertThat(reversedArray.get(6)).isEqualTo(5);
        assertThat(reversedArray.get(7)).isEqualTo(8);


    }
}
