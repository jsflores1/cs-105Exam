package edu.sbcc.cs105;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program {

	public static void main(String[] args) throws Exception {

		int[][] grades = {
				{1, 80, 75, 89, 43, 23, 98},
				{2, 90, 92, 97, 88, 72}, 
				{3, 76, 65, 45, 89}
				};
		
		ArrayList<StudentGrade> gradeList = new ArrayList<>();
		for (int row = 0; row < grades.length; row++){
			StudentGrade grade = new StudentGrade();
			
			grade.setStudentId(grades[row][0]);
			int total = 0;
			for (int col = 1; col < grades[row].length; col++){
				total += grades[row][col];
			}
			double average = total / (grades[row].length - 1);
			grade.setAverage(average);
			gradeList.add(grade);
		}
		
		for(StudentGrade g : gradeList){
			System.out.printf("The grade for student %d is %.1f%n", 
					g.getStudentId(), 
					g.getAverage());
			
		}
	}
}


