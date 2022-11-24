package in.co.constructor;

public class Person { 
	private String name;
	private String address;
	
 public  Person() {
	 System.out.println("this is a default constructor");
 }
public Person(String name) {
	this();
	System.out.println("this is one parameterized constructor");
}		
public Person(String name, String address) {
	this(name);
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}

}
