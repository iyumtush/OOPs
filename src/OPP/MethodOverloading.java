package OPP;

public class MethodOverloading {

	public static void main(String[] args) {

		double x = add(1 , 2);  //Method Overloading :  Method Overloading have the methods thats share
		System.out.println(x);  // Same method name and different parameters so it makes them unique and functional
		                        // Method Name +  Parameters = Method Signature
		                        // Method Overloading : Same Method Name +  Different Parameters
	}
	static int add(int a , int b)
	{
		System.out.println("OG Method");
		return a+b;
	}
	static int add( int a , int b , int c)
	{
		System.out.println("1st Overloaded method");
		return a+b+c;
	}
	static int add(int a , int b , int c ,int d)
	{
		System.out.println("2nd Overloaded method");
		return a+b+c+d;
	}
	static double add(double a , double b )
	{
		System.out.println("3rd Overloaded method");
		return a+b;
	}
	static double add(double a , double b , double c)
	{
		System.out.println("4rth Overloaded method");
		return a+b+c;
	}
	static double add(double a , double b , double c, double d)
	{
		System.out.println("5th Overloaded method");
		return a+b+c+d;
	}
	
}
