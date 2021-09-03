import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.nextLine();
		switch (day) {
		case "monday":
			System.out.println("Today is monday");
			break;
		case "tuesday":
			System.out.println("Today is tuesday");
			break;
		case "wednesday":
			System.out.println("Today is wednesday");
			break;

		case "thursday":
			System.out.println("Today is thursday");
			break;

		case "friday":
			System.out.println("Today is friday");
			break;

		case "saturday":
			System.out.println("Today is saturday");
			break;
		case "sunday":
			System.out.println("Sunday!!!!");
			break;
		default:
			System.out.println("Sry!!Enter a correct day");
			break;

		}

	}

}
