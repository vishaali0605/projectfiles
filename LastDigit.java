import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		double number1,number2,largest;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		number1 = sc.nextDouble();
		number2 = sc.nextDouble();
        largest = (number1 > number2)? number1: number2;
		System.out.println("The Largest Number = " + largest);   
	}
}
