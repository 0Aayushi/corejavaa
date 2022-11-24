package in.co.Polymorphism;

public class Overriding_Rectangle extends MethodOverriding {
	private int length;
	private int breath;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public double area() {
		return length*breath;
	}

}
