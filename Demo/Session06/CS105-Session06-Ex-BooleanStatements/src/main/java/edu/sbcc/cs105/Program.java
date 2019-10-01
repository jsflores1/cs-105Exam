package edu.sbcc.cs105;

import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1966);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date birthDate = cal.getTime();
				
		cal.set(Calendar.YEAR, 1996);
		cal.set(Calendar.MONTH, Calendar.JUNE);
		cal.set(Calendar.DAY_OF_MONTH, 30);
		Date hireDate = cal.getTime();
		
		//Employee e = new Employee("James", birthDate, hireDate, EmploymentTrack.Career );
		
		Employee e;
		
		e = getAdam();
		//e = getHans();
		printEmployee(e);

	}
	private static Employee getAdam(){

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1961);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date birthDate = cal.getTime();
				
		cal.set(Calendar.YEAR, 1996);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date hireDate = cal.getTime();
		
		Employee e = new Employee("Adam", birthDate, hireDate, EmploymentTrack.Career );
		return e;
	}
	
	private static Employee getHans(){

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1975);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date birthDate = cal.getTime();
				
		cal.set(Calendar.YEAR, 1997);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date hireDate = cal.getTime();
		
		Employee e = new Employee("Hans", birthDate, hireDate, EmploymentTrack.Career );
		return e;
	}
	private static void printEmployee(Employee e){
		
		System.out.printf("The employee is %d years old with %.1f years of service. The person %s retirement-eligible", 
				e.getAge(), 
				e.getYearsOfService(), 
				e.isRetirementEligible() ? "is" : "is not");
	}

}
