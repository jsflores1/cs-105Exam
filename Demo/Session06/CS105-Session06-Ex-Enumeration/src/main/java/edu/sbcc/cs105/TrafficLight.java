package edu.sbcc.cs105;

import java.util.ArrayList;

public class TrafficLight {

	private TrafficLightState _state;
	private ArrayList<TrafficLightObserver> _observers = new ArrayList<>();
	
	public TrafficLight(TrafficLightState initialState) {
		setState(initialState);
	}

	public void setState(TrafficLightState state){
		
		_state = state;
		
		// Let every observer know that the light has changed
		for(TrafficLightObserver observer : _observers){
			observer.notifyStateChange(state);
		}
	}
	
	public TrafficLightState getState(){
		
		return _state;
		
		
	}

	public void addObserver(TrafficLightObserver observer) {

		_observers.add(observer);
		
	}
}
