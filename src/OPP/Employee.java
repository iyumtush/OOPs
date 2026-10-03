package OPP;

public class Employee {
	
	String name;
	int empid;
	double salary;
	
	Employee(String name ,int empid , double salary){//Constructor
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	void Analize()
	{
		System.out.println(this.name+" Analyse data");
	}
	void Mine()
	{
		System.out.println(this.name+" Mines the data");
	}
}
