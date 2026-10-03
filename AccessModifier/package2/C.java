package package2;
import package1.*;


public class C {
	
	// Accessible everywhere.
	public String publicMsg = "This is an public message"; 
	
	//Accessible within the same package + subclasses in other packages.
 protected String protectedMsg = "This is an protected message";
 
     //Accessible within the same package. No keyword is written.
	       String defaultMsg = "This is an default message";
	       
	 //Accessible only within the same class.
	private String privateMsg = "This is an private message";
	
	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c.privateMsg);
	}

}
