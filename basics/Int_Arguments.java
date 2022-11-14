package basics;

public class Int_Arguments {
	public static void main(String []args) {
		int a = Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c=a+b;
		int d =a-b;
		int e=a*b;
		int f=a/b;
		System.out.println("Sum:"+c);
		System.out.println("difference:"+d);
		System.out.println("product:"+e);
		System.out.println("divide:"+f);
	}

}
