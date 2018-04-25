package chapter9_examples;

public class TestCircleWithStaticMembers {
	// Main method
	public static void main(String[] args) {
		System.out.println("Number of Circle objects: " +
				CircleWithStaticMembers.getNumberOfObjects());

		// Create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		System.out.println("c1: radius = " + c1.radius);
		System.out.println("Number of Circle objects: " +
				CircleWithStaticMembers.getNumberOfObjects());

		// Create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		System.out.println("c2: radius = " + c2.radius);
		System.out.println("Number of Circle objects: " +
				CircleWithStaticMembers.getNumberOfObjects());

		// Update radius of c1
		c1.radius = 100;
		System.out.println("c1: radius = " + c1.radius);
		System.out.println("Number of Circle objects: " +
				CircleWithStaticMembers.getNumberOfObjects());
	}
}
