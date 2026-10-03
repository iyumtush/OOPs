package Abstraction;

// Dog-specific implementations of the abstract Animal behaviors.
public class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Dogs Barks");
	}

	@Override
	void eat() {
        System.out.println("Dogs eats bone");
	}

}
