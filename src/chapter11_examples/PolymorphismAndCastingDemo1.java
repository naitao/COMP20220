package chapter11_examples;

public class PolymorphismAndCastingDemo1 {
	// Main method 
	public static void main(String[] args) {
		// Create and initialize three objects
		Object g = new GeometricObject();
		Object c = new Circle(5.0);
		Object r = new Rectangle(2.0, 3.0);

		// Print the type(s) of each object
		test(g);
		System.out.println("------");
		test(c);
		System.out.println("------");
		test(r);
	}

	// A method to check the type(s) of an object - an instance of a subclass can always 
	// be passed to a parameter of its superclass type.
	public static void test(Object o) {
		if (o instanceof Object) 
			System.out.println("object");
		
		if (o instanceof GeometricObject) 
			System.out.println("geometric object");
		
		if (o instanceof Circle)
			System.out.println("circle");
		
		if (o instanceof Rectangle) 
			System.out.println("rectangle");
	}
}
