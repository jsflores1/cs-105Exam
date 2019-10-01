package edu.sbcc.cs105;

public interface TrafficLightObserver {
	void notifyStateChange(TrafficLightState newState);
}
