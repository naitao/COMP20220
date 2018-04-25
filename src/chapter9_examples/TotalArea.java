package chapter9_examples;

public class TotalArea {
	// Main method
	public static void main(String[] args) {
		// Declare and create an array of Circle objects
		Circle[] circleArray = createCircleArray();

		// Print circleArray and the areas of the circles
		printCircleArray(circleArray);
		
		// Display the sum of circle areas
		System.out.printf("total area = " + sum(circleArray));
	}

	// Create an array of Circle objects 
	public static Circle[] createCircleArray() {
		// Declare and create an array of Circle objects
		Circle[] arr = new Circle[5];

		// Create Circle objects
		for (int i = 0; i < arr.length; i++) 
			arr[i] = new Circle(Math.random() * 5);

		return arr;
	}

	// Print an array of circles and the areas if the circles
	public static void printCircleArray(Circle[] arr) {
		for (int i = 0; i < arr.length; i++) 
			System.out.println("circle " + (i + 1) + " area = " + arr[i].getArea());
	}

	// Compute the sum of the areas of all circles in an array
	public static double sum(Circle[] arr) {
		// Initialize sum
		double sum = 0;

		// Add areas to sum
		for (int i = 0; i < arr.length; i++)
			sum += arr[i].getArea();

		return sum;
	}
}
