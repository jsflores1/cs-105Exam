package edu.sbcc.cs105;

import java.util.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.print("Enter a value: ");
		Scanner s = null;
		int x;
		String input = "";
		
		try{
			
			s = new Scanner(System.in);
		
			input = s.nextLine();				
			
			x = Integer.parseInt(input);
			
			System.out.printf("You entered %d", x);
			
		} catch (InputMismatchException ex){
			System.out.print("Invalid input");
			return;
		} catch (NumberFormatException ex){
			
			System.out.printf("'%s' is not a valid entry", input);
		} finally{
			s.close();
		}
		
		// Do something with x
		
	}

}
