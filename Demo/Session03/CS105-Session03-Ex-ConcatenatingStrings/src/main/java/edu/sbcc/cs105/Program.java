package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {

		
		String firstName = "Joe";
		String lastname = "Gaucho";
		
		// Example 1: Concat three strings using +
		String name = firstName + " " + lastname;
		System.out.println(name);
		

		// Example 2: Concat three strings using concat
		name = firstName.concat(" ").concat(lastname);
		System.out.println(name);
		
		// Example 3: Concat with Null
		String middleName = "Xavier";
		name = firstName.concat(" ").concat(middleName).concat(" ").concat(lastname);
		System.out.println(name);
		
				
				
	}

}
