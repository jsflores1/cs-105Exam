package edu.sbcc.cs105;

import java.util.ArrayList;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){
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
            }};
      
            for (String item : list) {
                System.out.println(item);
            }

    }
}