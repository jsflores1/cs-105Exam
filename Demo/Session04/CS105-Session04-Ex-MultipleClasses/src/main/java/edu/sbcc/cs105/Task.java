package edu.sbcc.cs105;

/**
 * Task
 */
public class Task {

    private String name;
    private Priority priority;
    private boolean isComplete;
    private int hours;

    public Task(String name, Priority priority, int hours) {

       this.name = name;
       this.priority = priority;
       this.hours = hours;
    }

    public boolean isComplete() {
        return isComplete;
    }

    
    public Priority getPriority() {
        return priority;
    }

    
    public String getName() {
        return name;
    }

    

    public void markDone(){
        isComplete  = true;
    }

	public int getHours() {
		return hours;
	}

}