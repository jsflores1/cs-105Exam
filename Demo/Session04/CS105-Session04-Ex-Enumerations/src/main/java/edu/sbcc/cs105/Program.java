package edu.sbcc.cs105;

public class Program {

	
	public static void main(String[] args) {

		Priority myPriority = Priority.HIGH;
		
		Task learnJava = new Task("Learn java", myPriority);

		printStatus(learnJava);

		learnJava.markDone();

		printStatus(learnJava);

		

	}

	public static void printStatus(Task task){
		String status = task.isComplete() ? "complete" : "incomplete";
		System.out.printf("The task %s is %s%n", task.getName(), status);

	}
}
