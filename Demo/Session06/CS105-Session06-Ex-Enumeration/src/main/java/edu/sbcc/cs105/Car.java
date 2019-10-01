package edu.sbcc.cs105;

public class Car implements TrafficLightObserver {

	private double _velocity;
	private double _lastVelocity;
	
	public void accelerate(double toVelocity, boolean saveLastVelocity){
		
		_velocity = toVelocity;
		
		if (saveLastVelocity){
			_lastVelocity = _velocity;
		}
		
	}
	
	public void stop(){
		
		_velocity = 0;
	}

	public double getVelocity(){
		return _velocity;
	}
	
	@Override
	public void notifyStateChange(TrafficLightState newState) {
		
		if(newState == TrafficLightState.Green && _velocity == 0){
			accelerate(_lastVelocity, true);
		} else if (newState == TrafficLightState.Red && _velocity > 0){
			stop();
		} else if (newState == TrafficLightState.Yellow && _velocity > 0){
			accelerate(_lastVelocity + 15, false);
		}
		
	}
}
