package T6;
import practical6_16212141.*;
import java.util.Scanner;

public class TestCircle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("c1: " + c1.toString());
		//System.out.print("hello,world");
		Circle c2 = new Circle(2, 10, 15);
		System.out.println("c2: " + c2.toString());
		
		Circle c3 = new Circle();
		System.out.println("c3: " + c3.toString());
		
		System.out.println("c1.x:" + c1.getX());
		System.out.println("c1.y: " + c1.getY());
		System.out.println("c1.radius:" + c1.getRadius());
		System.out.println("c1.numberOfObject: " + c1.getNumberOfObject());
		c1.setRadius(20);
		System.out.println("c1.radius:" + c1.getRadius());
		System.out.println("the area of this Circle: " + c1.getArea());
		c1.move(10, 10);
		System.out.println("c1.x:" + c1.getX());
		System.out.println("c1.y: " + c1.getY());
		System.out.println("c1 Perimeter: " + c1.getPerimeter());
		
		System.out.println("c2.x:" + c2.getX());
		System.out.println("c2.y: " + c2.getY());
		System.out.println("c2.radius:" + c2.getRadius());
		System.out.println("c2.numberOfObject: " + c2.getNumberOfObject());
		
		System.out.println("c3.x:" + c3.getX());
		System.out.println("c3.y: " + c3.getY());
		System.out.println("c3.radius:" + c3.getRadius());
		System.out.println("c3.numberOfObject: " + c3.getNumberOfObject());
		
		System.out.println("distance between c2 and c3 is:" + c2.getDistance(c3));
		System.out.println("distance between c3 and c2 is:" + c3.getDistance(c2));
		
		System.out.println("distance between c1 and c3 is:" + c1.getDistance(c3));
		System.out.println("distance between c3 and c1 is:" + c3.getDistance(c1));
		
		Circle c4 = new Circle(5, 5, 5);
		System.out.println("c4.x:" + c4.getX());
		System.out.println("c4.y: " + c4.getY());
		System.out.println("c4.radius:" + c4.getRadius());
		System.out.println("c4.numberOfObject: " + c4.getNumberOfObject());
		System.out.println("distance between c4 and c2 is:" + c4.getDistance(c2));
	}
}