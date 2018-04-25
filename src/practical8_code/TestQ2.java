package practical8_code;

public class TestQ2 {
	// Main method 
	public static void main(String[] args) {
		// Create an array of geometric objects
		GeometricObject c1 = new Circle(5);
		GeometricObject c2 = new Circle(1.5);
		c2.move(1.5, 1.5);
		GeometricObject r = new Rectangle(10, 5);
		r.move(-2, 2);
		GeometricObject p = new RegularPolygon(5, 1.5);
		p.move(10, -12.5);
		
		GeometricObject[] shapes = {c1, c2, r, p};

		// Display the array
		displayGeometricObjects(shapes);

		// Display the geometric objects that are furthest apart
		GeometricObject[] furthestShapes = GeometricObject.getFurthestGeometricObjects(shapes);
		System.out.println("\nThe two geometric objects that are furthest apart are:");
		System.out.println(furthestShapes[0]);
		System.out.println(furthestShapes[1]);
	}

	public static void displayGeometricObjects(GeometricObject[] arr) {
		for (GeometricObject o: arr)
			System.out.println(o); 	
	}
}
