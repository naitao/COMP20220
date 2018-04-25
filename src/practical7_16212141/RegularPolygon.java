package practical7_16212141;

public class RegularPolygon extends GeometricObject{
	private int n;
	private double length;
	public static final double PI = Math.PI;
	
	public RegularPolygon() {
		this(3, 1.0);
	}
	public RegularPolygon(int n, double length) {
		this.n = n;
		this.length = length;
	}
	public RegularPolygon(int n, double length, String color, boolean filled) {
		super(color, filled);
		this.n = n;
		this.length = length;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getPerimeter() {
		return n*length;
	}
	public double getArea() {
		double s = getPerimeter();
		double area = n * Math.pow(n,2) / (4 * Math.tan(PI/n));
		return area;
	}
	
}