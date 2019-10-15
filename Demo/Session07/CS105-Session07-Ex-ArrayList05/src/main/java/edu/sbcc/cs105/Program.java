package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>() {
            {
                // Add some words using initializer
                add("hello");
                add("thing");
                add("crazy");
                add("goodbye");
                add(1, "world");
            }
        };

        // create a secondary list from
        ArrayList<String> newList = new ArrayList<String>(list);

        list.set(0, "bon jour"); // NO EFFECT (newDict is diff object)

        for (String word : newList) {
            System.out.println(word);
        }

    }
}