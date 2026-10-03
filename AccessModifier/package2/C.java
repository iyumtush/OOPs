package package2;
import package1.*;

// Declares fields with four visibility levels for the access examples.
public class C {
	
	// Accessible from any class.
	public String publicMsg = "This is an public message"; 
	
	// Accessible within this package and from subclasses in other packages.
 protected String protectedMsg = "This is an protected message";
 
     // Package-private: accessible only within this package.
	       String defaultMsg = "This is an default message";
	       
	 // Accessible only within this class.
	private String privateMsg = "This is an private message";
	
	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c.privateMsg);
	}

}
