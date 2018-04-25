package practical2_16212141;
import java.util.Scanner;

public class Q8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input Enter a year:");
		int year = input.nextInt();
		System.out.print("Enter a month:(e.g. Jan, Feb, etc).");
		String strMonth = input.next();
		int days = 0;
		switch(strMonth){
			case "Jan":
				days = 31; break;
			case "Feb":
				boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				if (isLeapYear) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case "Mar":
				days = 31;break;
			case "Apr":
				days = 30;break;
			case "May":
				days = 31;break;
			case "Jun":
				days = 30;break;
			case "Jul":
				days = 31;break;
			case "Aug":
				days = 31;break;
			case "Sep":
				days = 30;break;
			case "Oct":
				days = 31; break;
			case "Nov":
				days = 30;break;
			case "Dec":
				days = 31;break;
			default:
				System.out.print("Please input the valid month!");break;
		}
		if (days != 0)
				System.out.print("In " + strMonth + " of year " + year + ", it has " + days + " days");
 	}
}