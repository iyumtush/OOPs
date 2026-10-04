package Dynamic_Polymorphism;

import java.util.Scanner;

public class Human {   //Dynamic polymorphism is when a superclass(Human) reference points to 
	                   //a subclass(Male & Female) object, and at runtime the subclass’s 
	                   //overridden method(natureGift()) is executed.

	public void natureGift()
	{
		System.out.println("You got life");
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose Your Gender and reveal the secret");
		System.out.print("---Select 1.Male & 2.Female---:  ");
		int choice = scanner.nextInt();
		
		if(choice == 1)
		{
			Male m = new Male();
			m.natureGift();
		}
		else if(choice == 2)
		{
			Female fm = new Female();
			fm.natureGift();
		}
		else
		{
			System.out.println("Invalid selection guessing Gay..");
			Human h = new Human();
			h.natureGift();
		}
	}

}
