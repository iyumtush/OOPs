package package2;

// Shows access to public, protected, and package-private members from C's package.
public class D {

	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c.publicMsg);
		
		System.out.println(c.defaultMsg);

		System.out.println(c.protectedMsg);
		
		//System.out.println(c.privateMsg); //Unable to access within the same package
	
	}

}
