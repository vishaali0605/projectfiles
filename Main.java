import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a three digit number ");
		number = sc.nextInt();
		while (number >= 10)
		{
            		      number /= 10;
		}
		if(number % 2 == 0)
		{
		    System.out.println("First digit divisible by 2");
		}
		else
		{
		    System.out.println("First digit not divisible by 2");
		}

	}

}
