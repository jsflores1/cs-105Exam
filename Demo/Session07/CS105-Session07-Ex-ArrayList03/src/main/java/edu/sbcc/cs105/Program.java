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

        // enumerate through all of the words
        System.out.println("Enumerating through the list");
        for (String word : list) {
            System.out.println(word);
        }

    }
}