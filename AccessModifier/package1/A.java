package package1;
import package2.*;

// Shows that public members are accessible across package boundaries.
public class A {
	
	String newMsg = "Hi";
	protected String protectedMsg = "This is an protected message";
	
	public static void main(String[] args) {
		

		C c = new C();
		
		//System.out.println(c.defaultMsg);
		System.out.println(c.publicMsg);
	}

}
