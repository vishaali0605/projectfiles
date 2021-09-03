import java.util.Scanner;

public class CheckingNumbers {
	public void evenodd(int a) {
		if (a % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	public void prime(int a) {
		boolean flag = true;
		for (int i = 2; i < a / 2; ++i) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}

	public void palindrome(int a) {
		int rem, temp, sum = 0;
		temp = a;
		while (a > 0) {
			rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("It is palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}
	}

	public void amstrong(int a) {
		int temp1, result = 0, rem1, sum1;
		temp1 = a;
		while (temp1 != 0) {
			rem1 = temp1 % 10;
			result += Math.pow(rem1, 3);
			temp1 = temp1 / 10;
		}

		if (result == a) {
			System.out.println("It is a amstrong number");
		} else {
			System.out.println("It is not a amstrong number");
		}

	}

	public void perfect(long a) {
		int i = 1;
		long sum = 0;
		while (i <= a / 2) {
			if (a % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == a) {
			System.out.println("The number is a perfect number");
		} else {
			System.out.println("The number is not a perfect number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckingNumbers cn = new CheckingNumbers();
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("The number is positive");

		} else {
			System.out.println("Sryy!!!Enter a correct number");
		}
		cn.evenodd(a);
		cn.prime(a);
		cn.palindrome(a);
		cn.amstrong(a);
		cn.perfect(a);
	}

}
