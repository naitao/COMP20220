package chapter9_examples;

public class TestCircle {
	// Main method
	public static void main(String[] args) {
		// Display the number of Circle objects created
		System.out.println("Number of Circle objects: " +
				Circle.getNumberOfObjects());

		// Create c1
		Circle c1 = new Circle();
		System.out.println("c1: radius = " + c1.getRadius());

		// Update the radius of c1
		c1.setRadius(100);
		System.out.println("c1: radius = " + c1.getRadius());

		// Create c2
		Circle c2 = new Circle(5);
		System.out.println("c2: " + c2.toString());

		// Display the number of Circle objects created
		System.out.println("Number of Circle objects: " +
				Circle.getNumberOfObjects());
	}
}
