package OPP;

public class FamilyDetails {
	
	String fname;
	static String lname = "Ingale"; //lname is static because everyone shares "Ingale".
	
	FamilyDetails(String fname ){
		
		this.fname = fname;
		
	}

	
   void display()
	{
		System.out.println(fname.concat(lname));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FamilyDetails pappa = new FamilyDetails("Gajanan " );
		FamilyDetails mummy = new FamilyDetails("Surekha " );
		FamilyDetails brother = new FamilyDetails("Manish ");
		FamilyDetails me = new FamilyDetails("Tushar ");
		
		
	
		pappa.display();
		mummy.display();
		brother.display();
		me.display();
	}

}
