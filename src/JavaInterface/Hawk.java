package JavaInterface;

// Implements predator behavior by hunting.
public class Hawk implements Predetor {

	@Override
	public void hunt() {
		System.out.println("**The Hawk hunts the snake**");
	}

}
