package basics;

import java.time.LocalDate;
import java.time.Period;

import java.util.Date;
public class Age {
	public static void main(String[]args) { 
	Date d = new Date();
	System.out.println("Current date:"+d ); 
	 LocalDate today = LocalDate.now();
	LocalDate dob = LocalDate.of(2003, 9, 23);
	 System.out.println("DOB:"+dob);
	 Period diff = Period.between(today, dob);
	 System.out.println(diff);
      

}
}
