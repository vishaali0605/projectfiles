import java.util.Scanner;
public class OddEven {
	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number : ");
			
			int num=sc.nextInt();
			
			if(num>0)
			{
				if(num%2==0)
					System.out.println("Number is Positive and Even!");
				else
					System.out.println("Number is Positive and Odd!");
			}

			else
			{
				if(num%2==0)
					System.out.println("Number is Negative and Even!");

				else
					System.out.println("Number is Negative and Odd!");
			}
		}

	}


