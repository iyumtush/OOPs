package OPP;

public class Hero extends Person
{
	String power;
	Hero( String name , int age , String power )
	{
		super(name , age);  //super keyword is used by a subclass to refer the immediate superclass.
		this.power = power;
	}
	
	public String toString(String power)
	{
		return super.toString() + this.power;
	}
}
