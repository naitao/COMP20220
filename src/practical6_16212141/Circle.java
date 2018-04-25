package practical6_16212141;

public class Circle {
	private double radius;
	private double x;
	private double y;
	private static int numberOfObject = 0;
	
	public Circle() {
		this(1.0,0,0);
	}
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		numberOfObject++;
	}
	public double getRadius() {
		return radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public static int getNumberOfObject() {
		return numberOfObject;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
	public double getDistance(Circle another) {
		double x2 = another.getX();
		double y2 = another.getY();
		double distance = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2));
		return distance;
	}
	public String toString() {
		String str = "The point x: " + this.getX() + 
				", y: " + this.getY() + ", radius: " + this.getRadius() + ", numberOfObject: " + numberOfObject;
		return str;
	}
}