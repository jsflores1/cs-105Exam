package edu.sbcc.cs105;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author James Kinneavy
 * 
 * This class simulates a car
 *
 */
public class Car {

	
	private String make;
	private String model;
	private int year;
	private int velocity;
	private double distanceTravelled = 0;
	private LocalDateTime lastCheckpoint;
	private LocalDateTime startTime;

	public Car(int initialVelocity) {

		startTime = LocalDateTime.now();
		lastCheckpoint = startTime;

		// Initialize the velocity. We could set the velocity here, 
		// but we are delegating to the accelerate method because there is logic
		accelerate(initialVelocity);
	}

	public Car() {
		accelerate(10);
	}

	/**
	 * Accessor for the make of the car
	 * 
	 * @return a string that represents the make of the car
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Sets the make of the car
	 * 
	 * @param make A string representing the make of the car
	 */
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Returns the velocity
	 * 
	 * @return The current velocity of the car
	 */
	public int getVelocity() {
		return velocity;
	}
	
	/**
	 * Changes the velocity of the car by the specified amount
	 * 
	 * @param byHowMuch The delta amount to increase or decrease
	 */
	public void accelerate(int byHowMuch) {
		
		updateTrip();

		int temp = velocity + byHowMuch;		
		this.velocity = temp >= 0 ? temp : 0;
	}
	
	public void stop(){

		updateTrip();
		velocity = 0;
	}

	public double getDistanceTravelled(){
		updateTrip();
		return distanceTravelled;
	}

	private void updateTrip(){
	

		// Determine amount of time travelled between now and the last checkpoint
		LocalDateTime now = LocalDateTime.now();
		long deltaSeconds = lastCheckpoint.until(now, ChronoUnit.SECONDS);
		double timeTravelledInHoursThisSegment = deltaSeconds / 3600d;

		// Reset the checkpoint
		lastCheckpoint = now;

		// Update distance travelled
		distanceTravelled = distanceTravelled + velocity * timeTravelledInHoursThisSegment;

	}

	
}
