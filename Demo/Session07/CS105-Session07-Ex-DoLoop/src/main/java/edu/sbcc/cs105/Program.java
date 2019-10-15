package edu.sbcc.cs105;

import java.util.Random;
import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        Random r = new Random();
        int secretNumber = r.nextInt(10) + 1;

        // Pre-initialization of guess not required
        int guess;// = r.nextInt(10) + 1;
        int loopCount = 0;
        Scanner input = new Scanner(System.in);
        do {

            loopCount++;
            System.out.println("Pick a number between 1 and 10");
            guess = input.nextInt();
            System.out.printf("User entered %d\n", guess);
        } while (guess != secretNumber);
        input.close();

        System.out.printf("User successfully guessed secret number after %d attempts", loopCount);

    }
}