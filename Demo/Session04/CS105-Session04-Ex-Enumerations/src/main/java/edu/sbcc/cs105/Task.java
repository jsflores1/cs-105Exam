package edu.sbcc.cs105;

/**
 * Task
 */
public class Task {

    private String name;
    private Priority priority;
    private boolean isComplete;

    public Task(String name, Priority priority) {

       this.name = name;
       this.priority = priority;
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

}