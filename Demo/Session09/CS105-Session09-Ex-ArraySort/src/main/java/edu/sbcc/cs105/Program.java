package edu.sbcc.cs105;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program {

	public static void main(String[] args) throws Exception {

		Random rng = new Random();

		final int arraySize = 20;
		int[] scores = new int[arraySize];

		System.out.println("Randomly ordered values");
		for (int i = 0; i < arraySize; i++){
		  scores[i] = rng.nextInt(100) + 1;
		  System.out.println(scores[i]);
		}

		
		Arrays.sort(scores);
		//Arrays.sort(scores, Collections.reverseOrder());
	
		System.out.println("\nSorted values");
		for (int i = 0; i < arraySize; i++){
		  System.out.println(scores[i]);
		}

	}
}


