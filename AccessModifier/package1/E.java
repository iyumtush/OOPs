package package1;

import package2.*;

public class E extends C{

	public static void main(String[] args) {
		
		C c = new C();
	
		
		System.out.println(c.publicMsg);
		
		E e = new E();
		System.out.println(e.protectedMsg);

	}

}
