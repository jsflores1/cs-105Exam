package edu.sbcc.cs105;

import java.math.BigDecimal;
import java.util.Date;

public class Student {

	private String id;
	private String lastName;
	private String firstName;
	private BigDecimal gpa;
	private Date birthDate;
	
	public void setId(String id) {		
		this.id = id;		
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;	
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}

	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
		
	}

	public String getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	
	public BigDecimal getGpa() {
		return gpa;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
