package Encapsulation;

public class Employee {

	private int empid; //private :→ Hides the data so it can be accessed directly only inside the same class.
	private String empname;
	private double salary;
	
	Employee(int empid , String empname , double salary)
	{ 
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
			}
	
	public void setEmpid(int empid) { //set : A method used to update/change the value of a private variable.
		this.empid = empid;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() //get : A method used to retrieve/read the value of a private variable.
	{
		return empid;
	}
	
	public String getEmpname()
	{
		return empname;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void copy(Employee x) //Method to copy objects
	{
		setEmpid(x.getEmpid());
		setEmpname(x.getEmpname());
		setSalary(x.getSalary());
	}
}
