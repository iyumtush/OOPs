package OPP;

public class Student {
	
	String name;
	int age , marks;
	
	Student(String name , int age ,int marks) //Constructor
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public static void main(String[] args) {

		Student std = new Student("Rahul", 20, 85);
		
		System.out.println("Name: "+std.name);
		System.out.println("Age: "+std.age);
		System.out.println("Marks : "+std.marks);
		
	}

}
