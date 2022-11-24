package in.co.constructor;

public class Employee extends Person{ 
	private int salary; 
	 
	public Employee() { 
		System.out.println("Default constructor");
	}
 public Employee(String name,String address,int Salary) {
	 super(name,address);
	 System.out.println("Using super keyword");
 }
}
