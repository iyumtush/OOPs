package JavaInterface;

// Runs examples of classes implementing one or multiple interfaces.
public class Main {

	public static void main(String[] args) {
	
		Mouse m = new Mouse();
		m.flee();
		
		Snake s = new Snake();
		
		s.hunt();
		s.flee();
		
		Hawk h = new Hawk();
		
		h.hunt();
	}

}
