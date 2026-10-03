package package1;
import package2.*;

// Shows that protected members are accessible within their declaring package.
public class B {

	public static void main(String[] args) {
		
		A s = new A();
		
		System.out.println(s.protectedMsg);
		
	}

}
