package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		
		
		TrafficLightState initialState = TrafficLightState.Green;
		
		Car myCar = new Car();
		TrafficLight trafficLight = new TrafficLight(initialState);
		System.out.printf("The light is now %s\n", trafficLight.getState());
		
		trafficLight.addObserver(myCar);
		
		double velocity = 25;
		myCar.accelerate(velocity, true);		
		System.out.printf("The car's current speed is %f\n", myCar.getVelocity());
		
		trafficLight.setState(TrafficLightState.Yellow);
		System.out.printf("The light is now %s\n", trafficLight.getState());
		System.out.printf("The car's current speed is %f\n", myCar.getVelocity());
		
		
		trafficLight.setState(TrafficLightState.Red);
		System.out.printf("The light is now %s\n", trafficLight.getState());
		System.out.printf("The car's current speed is %f\n", myCar.getVelocity());
		
		trafficLight.setState(TrafficLightState.Green);
		System.out.printf("The light is now %s\n", trafficLight.getState());
		System.out.printf("The car's current speed is %f\n", myCar.getVelocity());
		
		
		
	}

}
