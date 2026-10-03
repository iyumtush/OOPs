package JavaInterface;

// Implements both interfaces to demonstrate that a class can have multiple behaviors.
public class Snake implements Predetor, Prey
{
	@Override
	public void hunt() {
		System.out.println("The snake hunts the frog.");
	}

	@Override
	public void flee() {
		System.out.println("The snake flee from the hawk.");
	}
	
	
	
}