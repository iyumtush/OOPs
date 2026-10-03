package JavaInterface;

// Implements prey behavior by fleeing from danger.
public class Mouse implements Prey {
	@Override
	public void flee()
	{
		System.out.println("The mouse flee from snake");
	}
}
