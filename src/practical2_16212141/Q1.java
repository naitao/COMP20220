package practical2_16212141;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a, b, c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a == 0) {
        		System.out.println("a must be zero");
        		System.exit(1);
        }
        int discriminant = b*b - (4 * a * c);
        if (discriminant == 0) {
        		double r1 = (Math.sqrt(discriminant) - b)/(2*a);
        		System.out.printf("The root of equation is : " + r1);
        }
        else if (discriminant < 0)
        		System.out.print("The equation has no real roots");
        else {
        		double r1 = (Math.sqrt(discriminant) - b)/(2*a);
        		//System.out.print(Math.sqrt(discriminant));
        		double r2 = (0 - Math.sqrt(discriminant) - b)/(2*a);
        		System.out.printf("root 1 of equation is:" + r1);
        		System.out.printf("root 2 of equation is: " + r2);
        		}
        }
    }