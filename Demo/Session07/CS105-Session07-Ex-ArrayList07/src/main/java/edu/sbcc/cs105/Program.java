package edu.sbcc.cs105;

import java.util.ArrayList;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                // Add some words
                add("hello");
                add("thing");
                add("crazy");
                add("goodbye");
                add(1, "world");
            }
        };

        System.out.printf("The array has %d elements%n", list.size());

        list.clear();

        System.out.printf("The array now has %d elements%n", list.size());

    }
}