package OPP;

public class Company {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee("Tushar",16,26000.00);

		Employee employee2 = new Employee("Manish",21,30000.00);

		System.out.println(employee1.empid);

		employee1.Analize();
		employee2.Analize();
		employee2.Mine();
		employee1.Mine();
	}

}
