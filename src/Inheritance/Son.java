package Inheritance;

public class Son extends Father {
	
	int sonLand = 10;  // inheritance example father(lv1) > son (lv2)
	
	//Level 2
	void code()
	{
		System.out.println("Can do coding");
	}
	
	void drive()
	{
		System.out.println("Can drive vehicle");
	}
	
	
	//Method overriding in Java is an object-oriented programming feature 
	//that allows a subclass (child class) to provide a specific implementation of 
	//an instance method that is already defined in its superclass (parent class)
	@Override
	void dance()
	{
		System.out.println("Son can swim");
	}
	
	public static void main(String[] args) {
		

		Son son = new Son();
		
		son.dance();
		son.swim();
		son.laugh();
		
		
	}

}
