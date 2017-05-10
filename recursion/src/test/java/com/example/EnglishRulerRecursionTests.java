package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by amit on 5/10/17.
 */

public class EnglishRulerRecursionTests {

    @Test
    public void englishRulerTest() {
        int rulerLengthInInches = 1;
        int majorTickLength = 5;
        String expectedRulerString =    "----- 0\n" +
                "-\n" +
                "--\n" +
                "-\n" +
                "---\n" +
                "-\n" +
                "--\n" +
                "-\n" +
                "----\n" +
                "-\n" +
                "--\n" +
                "-\n" +
                "---\n" +
                "-\n" +
                "--\n" +
                "-\n" +
                "----- 1\n";
        EnglishRuler ruler = new EnglishRuler(rulerLengthInInches, majorTickLength);
        ruler.draw();
        assertThat(ruler.displayRuler()).isEqualTo(expectedRulerString);
    }
}
