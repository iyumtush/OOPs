package package2;

// Inherits a protected member from a class in another package.
public class Asub extends package1.A {

	public static void main(String[] args) {
       
		Asub asub = new Asub();

		System.out.println(asub.protectedMsg);
		
	}

}
