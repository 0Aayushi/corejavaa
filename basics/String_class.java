package basics;

public class String_class {
	public static void main(String[]args) {
String name = "Aayushi Yadav";
System.out.println("Length:"+name.length());
System.out.println("Character at 6th position:"+name.charAt(5));
System.out.println("Aayushi index is:"+name.indexOf("Aayushi"));
System.out.println("First position of a:"+name.indexOf("a"));
System.out.println("last position of a:"+name.lastIndexOf("a"));
System.out.println("a is replaced by b:"+name.replace("a","b"));
System.out.println("all a is replaced by b:"+name.replaceAll("a","b"));
System.out.println("lowercase:"+name.toLowerCase());
System.out.println("uppercase:"+name.toUpperCase());
System.out.println("Starts with Aayushi:"+name.startsWith("Aayushi"));
System.out.println("ends with v:"+name.endsWith("v"));
System.out.println("substring:"+name.substring(6));
}


}
