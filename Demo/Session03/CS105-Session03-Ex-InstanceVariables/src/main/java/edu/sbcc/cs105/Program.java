package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person joe = new Person();
		Person maria = new Person();

		joe.setFirstName("Joe");
		String firstName = joe.getFirstName();
		System.out.println(firstName);

		maria.setFirstName("Maria");
		firstName = maria.getFirstName();
		System.out.println(firstName);

		
	}

}
