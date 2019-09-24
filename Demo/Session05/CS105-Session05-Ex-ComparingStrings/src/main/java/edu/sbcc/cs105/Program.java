package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {

				
		String a = new String("A");
		String b = new String("A");
		String c = "a";
		String d = "a";
		
		// I am intentionally violating naming conventions for the sake of readability

		// This will be false because we explicitly created the string objects and they represent separate memory locations. 
		//Using == for strings (like other objects) compares object references, not content
		boolean compare_a_and_b_usingEqualsOperator = a == b;

		// This will return true not because the string values are the same, but Java performed interning
		// which pointed both references (c and d) to the same underlying object
		boolean compare_c_and_d_usingEqualsOperator = c == d;

		// This will of course return false, since they are separate objects in memory
		boolean compare_a_and_c_usingEqualsOperator = a == c;

		// Using .equals is the only valid way to compare strings, but this will not be equal becase a <> A
		boolean compare_a_and_c_usingEqualsMethod = a.equals(c);

		// This will be true because we are doing a case insensitive comparison
		boolean compare_a_and_c_usingEqualsMethodCaseInsensitive = a.equalsIgnoreCase(c);

		System.out.printf("a == b is %b\n", compare_a_and_b_usingEqualsOperator);		
		System.out.printf("c == d is %b\n", compare_c_and_d_usingEqualsOperator);		
		System.out.printf("a == c is %b\n", compare_a_and_c_usingEqualsOperator);
		System.out.printf("a equals c is %b\n", compare_a_and_c_usingEqualsMethod);
		System.out.printf("a equals c and we don't care about case is %b%n", compare_a_and_c_usingEqualsMethodCaseInsensitive);
		

		

	}

}
