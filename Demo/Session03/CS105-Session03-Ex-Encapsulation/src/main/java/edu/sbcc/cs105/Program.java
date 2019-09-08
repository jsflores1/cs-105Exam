package edu.sbcc.cs105;


public class Program {

	public static void main(String[] args) {


		BadStudent bs = new BadStudent();
		
		// No validation of data
		bs.studentId = "A12345678888888888888";
		System.out.println("Bad student set id to " + bs.studentId);
		

		// Init with a valid value for ID
		Student s = new Student("Joe", "Gaucho", "K12345678");

		// Set to a different valid value
		s.setStudentId("K12345679");

		// Set to an invalid value
		s.setStudentId("J12345679");

	}

}
