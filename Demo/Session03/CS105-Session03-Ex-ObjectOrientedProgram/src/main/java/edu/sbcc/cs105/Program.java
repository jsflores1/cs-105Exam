package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Initializing car's velocity to 60mph. Velocity is instanteous. The laws of physics don't apply to us!");
		Car c = new Car(60);


		Thread.sleep(15000);
		System.out.printf("The car has travelled %f miles%n after 15 seconds. Current velocity is %d mph.%n", 
			c.getDistanceTravelled(), c.getVelocity());

		System.out.println("Accelerating by 10 mph");
		c.accelerate(10);
		Thread.sleep(5000);
		System.out.printf("The car has travelled %f miles%n after 20 seconds. Current velocity is %d mph.%n", 
			c.getDistanceTravelled(), c.getVelocity());

		System.out.println("Decelerating by 10 mph");
		c.accelerate(-2);
		Thread.sleep(5000);
		System.out.printf("The car has travelled %f miles%n after 25 seconds. Current velocity is %d mph.%n", 
			c.getDistanceTravelled(), c.getVelocity());

		System.out.println("Accelerating by 8 mph");
		c.accelerate(8);
		Thread.sleep(5000);
		System.out.printf("The car has travelled %f miles%n after 30 seconds. Current velocity is %d mph.%n", 
			c.getDistanceTravelled(), c.getVelocity());

		
		System.out.printf("The velocity of the car is %d mph.%n", c.getVelocity());
		System.out.printf("The car has travelled %f miles%n", c.getDistanceTravelled());
		
		

	}

}
