package edu.sbcc.cs105;

/**
 * ResourceManager
 */
public class ResourceManager {

    private int hoursAllocated;

    public void recordTaskHours(Task task){

        hoursAllocated += task.getHours();       
    }

    public int getTotalHours(){
        return hoursAllocated;
    }
}