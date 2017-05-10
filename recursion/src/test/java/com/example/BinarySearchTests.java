package com.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by amit on 5/10/17.
 */

public class BinarySearchTests {

    @Test
    public void binarySearchTest() {
        ArrayList<Integer> randomValues = new ArrayList<Integer>(Arrays.asList(2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37));
        Integer searchValue = 4;
        int location = 1;

        BinarySearch binarySearch = new BinarySearch();
        assertThat(binarySearch.search(randomValues, searchValue)).isEqualTo(location);

    }
}
