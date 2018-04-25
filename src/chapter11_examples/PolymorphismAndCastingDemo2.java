package chapter11_examples;

public class PolymorphismAndCastingDemo2 {
	// Main method 
	public static void main(String[] args) {
		// Create and initialize two objects
		Object c = new Circle(5.0);
		Object r = new Rectangle(2.0, 3.0);

		// Display properties of the circle and rectangle
		display(c);
		display(r);
	}

	// A method for displaying an object - an instance of a subclass can always 
	// be passed to a parameter of its superclass type.
	public static void display(Object o) {
		if (o instanceof Circle) {
			System.out.println("\nThe circle area is " + ((Circle)o).getArea());
			System.out.println("The circle diameter is " + ((Circle)o).getDiameter());
		}
		else if (o instanceof Rectangle) {
			System.out.println("\nThe rectangle area is " + ((Rectangle)o).getArea());
			System.out.println("The rectangle perimeter is " + ((Rectangle)o).getPerimeter());
		}
	}
}
