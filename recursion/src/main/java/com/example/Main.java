package com.example;

/**
 * Created by amit on 5/10/17.
 */
public class Main {


    public static void main(String[] args) {
        EnglishRuler ruler = new EnglishRuler(1,3);
        ruler.draw();
        System.out.println(ruler.displayRuler());
    }
}
