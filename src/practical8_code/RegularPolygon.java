package practical8_code;

public class RegularPolygon extends GeometricObject {
	private int n; // The number of sides in the polygon
	private double length; // The length of each side

	// Construct a default regular polygon object
	public RegularPolygon() {
		this(3, 1.0);
	}

	// Construct a regular polygon object with the specified 
	// number of sides and length of side
	public RegularPolygon(int n, double length) {
		this.n = n;
		this.length = length;	
	}

	// Construct a regular polygon object with the specified 
	// number of sides, length of side, color and filled value 
	public RegularPolygon(int n, double length, String color, boolean filled) {
		super(color, filled);
		this.n = n;
		this.length = length;
	}

	// Return n
	public int getN() {
		return n;
	}

	// Set a new n
	public void setN(int n) {
		this.n = n;
	}

	// Return the side length
	public double getLength() {
		return length;
	}

	// Set a new side length
	public void setLength(double length) {
		this.length = length;
	}

	// Return the area
	@Override
	public double getArea() {
		return n * length * length / (4 * Math.tan(Math.PI / n));
	} 

	// Return the perimeter
	@Override
	public double getPerimeter() {
		return n * length;
	}

	// Return a string representation of this object
	@Override
	public String toString() {
		return super.toString() + ", number of sides: " + n + ", length of side: " + length;
	}
}

