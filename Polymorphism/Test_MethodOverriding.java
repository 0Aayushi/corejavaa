package in.co.Polymorphism;

public class Test_MethodOverriding {
	public static void main(String[]args) {
	    Overriding_Rectangle r = new Overriding_Rectangle();
	    Traingle t = new Traingle();
	    Circle c = new Circle();
	    
		r.setColor("red");
		System.out.println("color:"+r.getColor());
		r.setBorderWidth(10);
		System.out.println("bordewidth:"+r.getBorderWidth()); 
		r.setLength(10);
		System.out.println("length:"+r.getLength());
		r.setBreath(5);
		System.out.println("breath:"+r.getBreath());
		System.out.println("area of rectangle:"+r.area());
		
		t.setColor("black");
		System.out.println("color:"+t.getColor());
		t.getBorderWidth();
		System.out.println("borderWidth:"+t.getBorderWidth());
		t.setBase(12);
		System.out.println("base:"+t.getBase());
		t.setHeight(18);
		System.out.println("heigth:"+t.getHeight());
		System.out.println("area of traingle:"+t.area());
		 
		c.setColor("blue");
		System.out.println("color:"+c.getColor());
		c.setBorderWidth(15);
		System.out.println("bordewidth:"+r.getBorderWidth()); 
		c.setRadius(4);
		System.out.println("radius:"+c.getRadius());
		
		System.out.println("area of circle:"+c.area());
	}
	

}
