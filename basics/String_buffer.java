package basics;

public class String_buffer { 
	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Aayushi");
		obj.append("Yadav");
		System.out.println(obj);
		System.out.println("Length:"+obj.length());
		System.out.println("capacity:"+obj.capacity());
		System.out.println("char at:"+obj.charAt(6));
		System.out.println("index of:"+obj.indexOf("d"));
		System.out.println("Replace:"+obj.replace(0,7,"vijay"));
		System.out.println("reverse:"+obj.reverse());
	

}
	}
