package in.co.Polymorphism;

public class  Overloading { 
	public  static void main(String[]args) {
    add(8);
    add(9,10);
		
	}
	public static void add(int a) {System.out.println(++a);}
	public  static void add(int a, int b) {System.out.println(a+b);}

}
