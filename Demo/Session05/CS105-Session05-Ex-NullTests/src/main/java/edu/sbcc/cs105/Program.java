package edu.sbcc.cs105;

import edu.sbcc.cs105.Student;

public class Program {

	public static void main(String[] args){
		
		Student s1 = new Student("Joe");
		
		Student s2 = null;
		
		printNameOfStudent(s1);

		printNameOfStudent(s2);

	}
	
	public static void printNameOfStudent(Student s){
		
		if (s != null){
			System.out.println(s.getName());
		}else
		{
			System.out.printf("The student object is not valid (i.e. it is null)%n");
		}
		
	}

	
}
