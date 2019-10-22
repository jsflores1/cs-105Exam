package edu.sbcc.cs105;

import java.util.ArrayList;

public class CourseOffering {

	private String termCode;
	private String courseName;
	private String courseCode;

	private ArrayList<Student> students = new ArrayList<>();
	private int capacity;
	private String sectionCode;
	
	public CourseOffering(String termCode, String sectionCode, String courseCode, String courseName, int capacity) {
		
		this.termCode = termCode;
		this.sectionCode = sectionCode;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.capacity = capacity;
	}
	
	public boolean enroll(Student student) {
		
		boolean canAdd = students.size() < capacity;
		if (canAdd) {
			students.add(student);
			student.addCourseToSchedule(this);
		}
		
		return canAdd;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public ArrayList<Student> getEnrolledStudents(){
		
		return new ArrayList<Student>(students);
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public String getTitle() {

		return String.format("%s - %s", courseCode, courseName);
	}

	public String getTermCode() {
		return termCode;
	}


	
	
}
