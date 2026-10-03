package package1;

import package2.*;

// Shows protected-member access from a subclass in a different package.
public class E extends C{

	public static void main(String[] args) {
		
		C c = new C();
	
		
		System.out.println(c.publicMsg);
		
		E e = new E();
		System.out.println(e.protectedMsg);

	}

}
