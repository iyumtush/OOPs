package OPP;

public class AreaOfRectangle {
	
	int length , width;
	
	AreaOfRectangle()
	{
		length = 10;
		width = 5;
	}

	AreaOfRectangle(int length , int width)
	{
		this.length = length;
		this.width = width;
	}
	
	void area1()
	{
		System.out.println("Rectangle of 1 Area : "+length * width);
	}
	void area2()
	{
		System.out.println("Rectangle of 2 Area : "+this.length * this.width);
	}

	public static void main(String[]args)
	{
		
		AreaOfRectangle R1 = new AreaOfRectangle();
		
		AreaOfRectangle R2 = new AreaOfRectangle(20 , 10);
		
		//System.out.println("Rectangle 1 Area : "+ R1.length * R1.width);
		//System.out.println("Rectangle 2 Area : "+ R2.length * R2.width);
		R1.area1();
		R2.area2();
		
	}

}
