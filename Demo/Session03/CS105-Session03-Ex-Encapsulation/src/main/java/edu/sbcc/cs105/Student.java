package edu.sbcc.cs105;

public class Student {

	private String studentIdentifier;
	private String lastName;
	private String firstName;

	public Student(String firstName, String lastName, String studentIdentifier) {

		this.setFirstName(firstName);
		this.setLastName(lastName);

		// Instead of directly setting the instance variable, we call the setStudentId
		// method because it supports encapsulation
		setStudentId(studentIdentifier);
	}

	/**
	 * 
	 * @return Student's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the Student's first name
	 * @param firstName The new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return Student's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the Student's last name
	 * @param lastName The new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return The student identifier
	 */
	public String getStudentId() {
		return studentIdentifier;
	}

	/**
	 * Enables setting the student id as long as it meets the following rules;
	 * 1) Total ength is 9 characters
	 * 2) Starts with a K
	 * 3) The last 8 characters are numeric
	 * @param value
	 */
	public void setStudentId(String value) {

		boolean isValid = true;

		isValid = value.length() == 9;
		if (!isValid) {
			System.out.println("Invalid length");
			return;
		}

		isValid = value.startsWith("K");
		if (!isValid) {
			System.out.println("Student ID must begin with value 'K'");
			return;
		}

		// Numeric check
		try {
			// Try to parse the last 8 characters of the string as an integer 
			Integer.parseInt(value.substring(1));
		} catch (NumberFormatException ex) {
			System.out.println("Last 8 characters must be numeric");
			return;
		}

		studentIdentifier = value;
	}

}
