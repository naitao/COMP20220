package chapter11_examples;

public class PolymorphismDemo {
	// Main method 
	public static void main(String[] args) {
		// Create a circle with specified radius, color, and filled value
		Circle c = new Circle(5, "red", false);
		display(c);

		// Create a rectangle with specified width, height, color, and filled value
		Rectangle r = new Rectangle(2, 4, "black", true);
		display(r);
	}

	// Display geometric object properties - an instance of a subclass can always 
	// be passed to a parameter of its superclass type.
	public static void display(GeometricObject o) {
		System.out.println(
				"color: " + o.getColor() + 
				"\nis filled: " + o.isFilled() + "\n");
		
		//System.out.println("radius: " + o.getArea()); 
	}
}
