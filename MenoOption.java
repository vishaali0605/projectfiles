import java.util.Scanner;

public class MenoOption {
	public static void main(String[] args) {
		System.out.println("1.Even Or Odd");
		System.out.println("2.prime or not");
		System.out.println("3.palindrome or not");
		System.out.println("4.amstrong or not");
		System.out.println("5.perfect or not");
		System.out.println("6.exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter a number");
				int a1 = sc.nextInt();
				if (a1 % 2 == 0) {
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
				break;
			case 2:
				System.out.println("enter a number");
				int a2 = sc.nextInt();
				boolean flag = false;
				for (int i = 2; i < a2 / 2; ++i) {
					if (a2 % i == 0) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("prime");
				} else
					System.out.println("not prime");
				break;
			case 3:
				System.out.println("enter a number");
				int a3 = sc.nextInt();
				int rem, temp, sum = 0;
				temp = a3;
				while (a3 > 0) {
					rem = a3 % 10;
					sum = (sum * 10) + rem;
					a3 = a3 / 10;
				}
				if (temp == sum) {
					System.out.println("It is palindrome number");
				} else {
					System.out.println("It is not a palindrome number");
				}
				break;
			case 4:
				System.out.println("enter a number");
				int a4 = sc.nextInt();
				int temp1, result = 0, rem1, sum1;
				temp1 = a4;
				while (temp1 != 0) {
					rem1 = temp1 % 10;
					result += Math.pow(rem1, 3);
					temp1 = temp1 / 10;
				}

				if (result == a4) {
					System.out.println("It is a amstrong number");
				} else {
					System.out.println("It is not a amstrong number");
				}
				break;
			case 5:
				System.out.println("enter a number");
				int a5 = sc.nextInt();
				int i = 1;
				long sum11 = 0;
				while (i <= a5 / 2) {
					if (a5 % i == 0) {
						sum11 = sum11 + i;
					}
					i++;
				}
				if (sum11 == a5) {
					System.out.println("The number is a perfect number");
				} else {
					System.out.println("The number is not a perfect number");
				}
				break;
			case 6:
				System.out.println("EXIT");
				break;
				
			default:
				System.out.println("Wrong option");
				break;
			}
		}
	}

