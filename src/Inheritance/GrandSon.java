package Inheritance;

// Inherits behavior and land fields through both levels of the hierarchy.
public class GrandSon extends Son {

	
	// Inheritance Example father > son > grandson
	//Level 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandSon gson = new GrandSon();
		
		gson.laugh();
		gson.drive();
		gson.code();
		gson.swim();
		
		
		System.out.println("Grand son have total land : "+(gson.fatherLand + gson.sonLand)+ " acre ");
	}

}
