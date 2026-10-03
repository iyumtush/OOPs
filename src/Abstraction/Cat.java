package Abstraction;

// Cat-specific implementations of the abstract Animal behaviors.
public class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("Cat make meow");
	}

	@Override
	void eat() {
	System.out.println("Cat eats fish");
	}

}
