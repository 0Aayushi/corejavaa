package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time2 { 
	public static void main(String[]args) throws ParseException {
	Date d = new Date();
	
		//SimpleDateFormat format=new SimpleDateFormat("dd/MM/yy");
	SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z");
	
	String str=format.format(d);
	System.out.println("Date:"+str);
	
		//String str1 = "10/11/2022 ";
	String str1 = "2022.11.10 AD at 03:32:36 IST ";
	
	Date d1= format.parse(str1);
	
	
	System.out.println(d1);
	
	
}

}
