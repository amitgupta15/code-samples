package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by amit on 5/17/17.
 */
public class ComputePowerTests {

    @Test
    public void simplePowerComputationTest() {
        ComputePower computePower = new ComputePower();

        assertThat(computePower.simpleCompute(2,6)).isEqualTo(64);

    }

    @Test
    public void optimizedPowerComputationTest() {
        ComputePower computePower = new ComputePower();

        assertThat(computePower.optimizedCompute(2,6)).isEqualTo(64);
        assertThat(computePower.optimizedCompute(2,5)).isEqualTo(32);
    }
}
