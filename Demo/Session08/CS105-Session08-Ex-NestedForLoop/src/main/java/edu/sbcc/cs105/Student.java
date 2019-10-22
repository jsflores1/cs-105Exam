package edu.sbcc.cs105;

import java.util.ArrayList;

public class Student {

	private String studentId;
	private String name;
	private ArrayList<CourseOffering> schedule = new ArrayList<>();
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return studentId;
	}

	public void addCourseToSchedule(CourseOffering courseOffering) {

		schedule.add(courseOffering);		
	}
	
	public ArrayList<CourseOffering> getEnrollments(){
		
		return new ArrayList<CourseOffering>(schedule);
	}
}
