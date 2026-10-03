package OPP;

import java.util.Scanner;

public class ParmeterPassingInMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int x = scanner.nextInt();
		System.out.print("Enter second number : ");
		int y = scanner.nextInt();
		
		add(x,y);
		
		System.out.println("\nThe sum of "+x+" & "+y+" is : "+add(x,y));
	}
	
	static int add(int x , int y)
	{
		int z = x+y;
		
		return z;
	}

}
