package edu.sbcc.cs105;

import java.util.ArrayList;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        intList.set(2, 42);

        for (Integer i : intList) {
            System.out.println(i.intValue());
        }

    }
}