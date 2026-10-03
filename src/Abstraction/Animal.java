package Abstraction;

// Shared behavior for animals; subclasses define their own sound and food.
public abstract class Animal {

	abstract void sound();
	
	abstract void eat();
	
	void run()
	{
		System.out.println("can run");
	}
}
