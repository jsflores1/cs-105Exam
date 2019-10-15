package edu.sbcc.cs105;

import java.util.ArrayList;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        // Add some words
        list.add("hello");
        list.add("thing");
        list.add("crazy");
        list.add("goodbye");
        list.add(1, "world");

        // Get the third element in the list
        System.out.println("Word at position 2 (3rd word): " + list.get(2));

    }
}