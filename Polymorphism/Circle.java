package in.co.Polymorphism;

public class Circle extends MethodOverriding { 
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	

}
