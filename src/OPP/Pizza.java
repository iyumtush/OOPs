package OPP;

import java.util.Scanner;

public class Pizza { //Constructor overloading
	
	String bread;
	String cheese;
	String sauce;
	String topping;
	
	Pizza()
	{
		
	}
	Pizza(String bread)
	{
		this.bread = bread;
	}
	
	Pizza(String bread, String cheese )
	{
		this.bread = bread;
		this.cheese = cheese;
	}
	
	Pizza(String bread, String cheese ,String sauce)
	{
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
	}
	
	Pizza(String bread, String cheese ,String sauce,String topping)
	{
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
		this.topping = topping;
	}

	public static void main(String[] args) { //Overloading Constructor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---Give you customization---");
		System.out.println("Enter type of bread : ");
		String bread = sc.nextLine();
		System.out.println("Enter type of cheese : ");
		String cheese = sc.nextLine();
		System.out.println("Enter type of sauce : ");
		String sauce = sc.nextLine();
		System.out.println("Enter type of topping : ");
		String topping = sc.nextLine();

		//Constructor which receive same number of input parameter value execute
		Pizza pizza = new Pizza(bread , cheese , sauce , topping);
		
		System.out.println("Here is the pizza ingrediants :");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.topping);  
	}

}
