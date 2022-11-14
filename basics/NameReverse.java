package basics;

public class NameReverse {
	public static void main(String[]args) {
	String name = "Aayushi Yadav";
	String b[] = name.split(" ");
    for(String d:b) {
    	for(int i=d.length();i>=1;i--) {
    		System.out.print(d.charAt( i-1));    		
    	}System.out.print("\t");}
    }

	
}
