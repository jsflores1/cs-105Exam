package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) throws Exception {

		Person p = new Person("Joe", "Gaucho", 21);
		
		System.out.printf("The new person is %s %s. They are %d years old.%n", 
			p.getFirstName(), p.getLastName(), p.getAge());
		

	}

}
