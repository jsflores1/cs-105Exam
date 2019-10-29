package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {


		// Passing comma delimited sequence of values
		Pizza myPizza = new Pizza(42, "Pepperoni", "Sausage", "Mushrooms", "Garlic", "Kimchi");

		// Passing array reference
		String[] toppings = {"Anchovies", "Mushrooms", "Sausage"};
		Pizza yourPizza = new Pizza(10, toppings);

		

	}

}
