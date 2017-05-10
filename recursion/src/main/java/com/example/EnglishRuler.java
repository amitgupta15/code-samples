package com.example;

/**
 * Created by amit on 5/10/17.
 * [Data Structures and Algorithms in Java, 6th Edition, page 194] The English ruler pattern is a simple example
 * of a fractal, that is, a shape that has a self-recursive structure at various levels of magnification.
 * ----- 0
 * -
 * --
 * -
 * ---
 * -
 * --
 * -
 * ----
 * -
 * --
 * -
 * ---
 * -
 * --
 * -
 * ----- 1
 * Ignoring the lines containing 0 and 1, let us consider how to draw the sequence of ticks lying between these lines. The
 * central tick (at 1/2 inch) has length 4. Observe that the two patterns of ticks above
 * and below this central tick are identical, and each has a central tick of length 3.
 *
 * In general, an interval with a central tick length L >=1 is composed of:
 * - An interval with a central tick of length L - 1
 * - A single tick of length L
 * - An interval with a central tick of length L - 1
 */

public class EnglishRuler {

    private String rulerString = "";
    private int rulerLengthInInches;
    private int majorTickLength;

    public EnglishRuler(int rulerLengthInInches, int majorTickLength) {
        this.rulerLengthInInches = rulerLengthInInches;
        this.majorTickLength = majorTickLength;
    }

    public String displayRuler() {
        return rulerString;
    }

    public void draw() {
       drawTick(majorTickLength, 0);

       for (int i=1; i<=rulerLengthInInches; i++) {
           drawInterval(majorTickLength - 1);
           drawTick(majorTickLength, i);
       }
    }

    private void drawInterval(int length) {
        if(length >= 1) {
            drawInterval(length-1);
            drawTick(length,-1);
            drawInterval(length-1);
        }
    }

    private void drawTick(int majorTickLength, int label) {
        for (int i=0; i<majorTickLength; i++) {
            rulerString += "-";
        }
        if(label >= 0) {
            rulerString += " " + label;
        }
        rulerString += "\n";
    }
}
