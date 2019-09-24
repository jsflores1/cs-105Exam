package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args){
		
		// Change the value of this variable to see the difference
		int applicantFico = 600;
		
		if (applicantFico > 750) {
			grantFivePercentLoan(); // Some method in the current class
		} else{
			System.out.println("You are not elible");
		}
			
		printMessage("Done");

		// Why we always want to use curly braces for ifs - indentation means nothing
		applicantFico = 600;
		if (applicantFico > 750)
			System.out.println("You are eligible for a loan");
			System.out.println("here is your million dollar loan");
			

	}

	private static void printMessage(String message) {
		System.out.println(message);
	}

	private static void grantFivePercentLoan() {
		
		System.out.println("you are approved for a 5% loan");


	}
}
