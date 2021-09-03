import java.util.Scanner;

//write a program to accept a symbol from user and perform operation.
public class Symbols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the symbol");
		char choice = sc.next().charAt(0);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		// char choice=sc.next().charAt(0);
		switch (choice) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		default:
			System.out.println("Incorrect option");
			break;

		}

	}

}
