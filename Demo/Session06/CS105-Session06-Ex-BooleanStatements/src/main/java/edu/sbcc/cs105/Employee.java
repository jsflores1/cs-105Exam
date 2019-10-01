package edu.sbcc.cs105;

import java.math.BigDecimal;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Employee {

	private Date hireDate;
	private String name;
	private Date birthDate;
	private EmploymentTrack track;
	
	public Employee(String name, Date birthDate, Date hireDate, EmploymentTrack track){
		
		this.name = name;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.track = track;
		
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	
	public int getAge(){
		
		System.out.println("In getAge");
		Date today = new Date();
			
		Period duration = Period.between(
				birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
				today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		
		return duration.getYears();

	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmploymentTrack getTrack() {
		return track;
	}
	public void setTrack(EmploymentTrack track) {
		this.track = track;
	}
	public boolean isRetirementEligible() {

		boolean result;
		
		result = 
				hiredBeforeCutoff() 
				&& track == EmploymentTrack.Career 
				&& (
						getAge() >= 50 && getYearsOfService().compareTo(new BigDecimal(20)) >= 0 
						|| getAge() >= 62 && getYearsOfService().compareTo(new BigDecimal(12)) >= 0);
		
		return result;
		
	}
	
	public BigDecimal getYearsOfService() {
		
		System.out.println("In getYearsOfService");
		BigDecimal result;
		
		Date today = new Date();
		
		Period duration = Period.between(
				hireDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
				today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		
		// This calculation is simplified and therefore slightly inaccurate.
		int days = duration.getMonths() * 30 + duration.getDays();
		result = new BigDecimal(duration.getYears() + days / 365d);

		
		return result;
		
	}
	private boolean hiredBeforeCutoff(){
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2001);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date cutoffDate = cal.getTime();
		
		int result = cutoffDate.compareTo(hireDate);
		
		return result >= 0;
	}
	
	
}
