package edu.sbcc.cs105;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) throws FileNotFoundException  {

		StudentFileImporter fileImporter 
			= new StudentFileImporter();
		
		try {
			fileImporter.load(".\\StudentDataFile.txt");
		} catch (FileNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter w = new PrintWriter(".\\data.txt");

		ArrayList<Student> students = fileImporter.getStudents();
		for(Student s : students){
			w.printf("%s  %-40s  %.2f%n", 
			s.getId(), 
			s.getLastName() + ", " + s.getFirstName(), 
			s.getGpa().doubleValue() );
		}
		w.close();

	}

}
