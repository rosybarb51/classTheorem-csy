
public class Circle2 {
	int radius;
	String name;
	
	public Circle2() {
		radius = 1;
		name = "";
	}
	
	public Circle2(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	
	public double getArea() {
		double result = 3.14 * radius * radius;
		return result;
	}
}
