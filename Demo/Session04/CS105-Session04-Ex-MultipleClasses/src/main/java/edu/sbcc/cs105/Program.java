package edu.sbcc.cs105;

public class Program {

	
	public static void main(String[] args) {

		Priority myPriority = Priority.HIGH;
		
		Task task1 = new Task("Learn java", myPriority, 50);
		Task task2 = new Task("Write killer app", myPriority, 100);
		Task task3 = new Task("Spend big payday", myPriority, 1);
		
		ResourceManager manager = new ResourceManager();
		manager.recordTaskHours(task1);
		manager.recordTaskHours(task2);
		manager.recordTaskHours(task3);
		
		System.out.printf("Total hours to get big payday was %d%n", manager.getTotalHours());

	}

	
}
