package Abstraction;

// Runs the abstraction example with two concrete Animal subclasses.
public class Main {

	public static void main(String[] args) {
	
		Cat c = new Cat();
		
		c.eat();
		c.run();
		c.sound();
		
		Dog d = new Dog();
		
		d.sound();
		d.eat();
		d.run();	
		
	}

}
