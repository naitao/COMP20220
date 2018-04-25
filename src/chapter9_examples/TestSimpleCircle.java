package chapter9_examples;

public class TestSimpleCircle {
	// Main method 
	public static void main(String[] args) {
		// Create c1 - a circle with radius 1
		SimpleCircle c1 = new SimpleCircle();
		System.out.println("Radius: " + c1.radius);
		System.out.println("Area: " + c1.getArea() + "\n");

		// Create c2 - a circle with radius 25
		SimpleCircle c2 = new SimpleCircle(25);
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea() + "\n");
		
		// Update radius of c2
		c2.radius = 100; 
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea() + "\n");
	}
}
