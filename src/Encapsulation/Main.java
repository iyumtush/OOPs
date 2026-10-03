package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101 , "Tushar", 44000);
		
		Employee e2 = new Employee(102 , "Manish", 60000);
		
		e1.copy(e2); //Java Copy Objects
		
		
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(e1.getSalary());
		System.out.println();
		System.out.println(e2.getEmpid());
		System.out.println(e2.getEmpname());
		System.out.println(e2.getSalary());

	}

}
