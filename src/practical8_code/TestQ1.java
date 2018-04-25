package practical8_code;

public class TestQ1 {
	// Main method 
	public static void main(String[] args) {
		// Create an array of geometric objects
		GeometricObject[] shapes = {
				new Circle(5), 
				new Rectangle(10, 5),
				new RegularPolygon(5, 1.5),
				new Circle(),
				new Circle(15),
				new Rectangle(),
				new RegularPolygon()
		};

		// Sort the array and display its elements
		java.util.Arrays.sort(shapes);
		displayGeometricObjects(shapes);

		System.out.println("\n********************\n");
		
		// Scale all Scalable GeometricObjects by a factor of 3.5
		scaleGeometricObjects(shapes, 3.5);
		
		// Sort the array and display its elements
		java.util.Arrays.sort(shapes);
		displayGeometricObjects(shapes);

	}

	public static void displayGeometricObjects(GeometricObject[] arr) {
		for (GeometricObject o: arr)
			System.out.printf("%s, area: %.2f\n", o.toString(), o.getArea());	
	}
	
	public static void scaleGeometricObjects(GeometricObject[] arr, double factor) {
		for (GeometricObject o: arr)
			if (o instanceof Scalable)
				((Scalable) o).scale(factor);
	}
}


