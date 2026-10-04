package Polymorphism;

public class Vehicle {

	public void start()
	{
		System.out.println("The vehicle is started !!!");
	}
	public static void main(String[] args) {

		Auto auto = new Auto();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] travel = {auto , bicycle , boat};
		
		for(Vehicle x : travel)
		{
			x.start();
		}
	}

}

// A superclass reference invokes the overridden method for each runtime subtype.