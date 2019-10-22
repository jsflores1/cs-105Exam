package edu.sbcc.cs105;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFileImporter {

	private ArrayList<Student> studentList = new ArrayList<Student>();

	public void load(String filePath) throws FileNotFoundException, ParseException{

		studentList.clear();
		File studentFile = new File(filePath);
		Scanner fileScanner = new Scanner(studentFile);
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

		while (fileScanner.hasNextLine()){
			String studentRecord = fileScanner.nextLine();
			String[] studentData = studentRecord.split(",");

			
			if (studentData.length == 5){

				Student s = new Student();
				s.setId(studentData[0]);
				s.setLastName(studentData[1]);
				s.setFirstName(studentData[2]);
				s.setBirthDate(format.parse((studentData[3])));
				s.setGpa(BigDecimal.valueOf( Double.parseDouble(studentData[4])));

				studentList.add(s);
			}
		}
		fileScanner.close();
	}

	public ArrayList<Student> getStudents(){
		return studentList;
	}
}
