package OPP;

import java.util.Random;

public class DiceRoller { //Ex : to understand what Local and Global variable
	
	Random random;///Global Variable
	int number = 0;//if we write these in the method only it become local variables
	
	DiceRoller()
	{
		random = new Random();
		roll();
	}
	
	void roll()
	{
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

	public static void main(String[] args) {

		DiceRoller roller = new DiceRoller();
	}
}
