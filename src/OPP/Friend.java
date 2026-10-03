package OPP;

public class Friend {

	String name;
	
	static int numberOfFriends; //Static
	
	Friend(String name)
	{
		this.name = name;
		numberOfFriends++;
	}
	
	static void display()
	{
		System.out.println("The Total Count Of Players :" +numberOfFriends);
	}

	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Tushar");
		Friend friend2 = new Friend("Manish");
		
		Friend.display();
		
	}
}
