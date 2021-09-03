import java.util.Scanner;

class RegularAccount {
	Scanner sc = new Scanner(System.in);
	String name;
	double balance;
	String pin;
	double minbalance;
	double penalty;

	void create_account() {
		System.out.println("Enter the name of customer");
		name = sc.nextLine();
		System.out.println("Enter the balance of this account");
		balance = sc.nextDouble();
		System.out.println("Enter the pin of customer");
		pin = sc.next();
		System.out.println("Account sucessfully created");
	}

	double deposit_amount(double deposit) {
		balance = balance + deposit;
		System.out.println("Amount deposited sucessfully " + balance);
		return 0;

	}

	double withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount is sucessfully withdrawn " + balance);
		return 0;

	}

	void access_balance() {
		System.out.println("The balance is " + balance);
	}

	void access_name() {
		System.out.println("The name of the customer is " + name);
	}

	void valid_pin(String pin) {
		if (pin.length() <= 6) {
			System.out.println("The pin is valid");

		} else {
			System.out.println("Not valid ");
			System.out.println("Enter a valid pin less than 6");
			pin = sc.next();
			valid_pin(pin);
		}

	}

	void compute_fees() {
		System.out.println(0.1 * balance);
	}

	void compute_interest() {
		System.out.println("No interest for regular account");
	}

	void penalty() {
		if (balance < 500) {
			System.out.println("Penalty amount is 10");
		} else {
			System.out.println("No penalty for this account");
		}
	}

}

class InterestAccount extends RegularAccount {
	double interest;

	void create_account() {
		System.out.println("Enter the name of customer");
		name = sc.nextLine();
		System.out.println("Enter the balance of this account");
		balance = sc.nextDouble();
		System.out.println("Enter the pin of customer");
		pin = sc.next();
		System.out.println("Account sucessfully created");
	}

	double deposit_amount(double deposit) {
		balance = balance + deposit;
		System.out.println("Amount deposited sucessfully " + balance);
		return 0;

	}

	double withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount is sucessfully withdrawn " + balance);
		return 0;

	}

	void access_balance() {
		System.out.println("The balance is " + balance);
	}

	void access_name() {
		System.out.println("The name of the customer is " + name);
	}

	void valid_pin(String pin) {
		if (pin.length() <= 6) {
			System.out.println("The pin is valid");

		} else {
			System.out.println("Not valid ");
			System.out.println("Enter a valid pin less than 6");
			pin = sc.next();
			valid_pin(pin);
		}

	}

	void compute_fees() {
		System.out.println(0.1 * balance);
	}

	void compute_interest() {
		System.out.println(0.07 * balance);
	}

	void penalty() {
		System.out.println("No penalty for Interest Account");

	}
}

class CheckingAccount extends InterestAccount {
	int trans;

	void create_account() {
		System.out.println("Enter the name of customer");
		name = sc.nextLine();
		System.out.println("Enter the balance of this account");
		balance = sc.nextDouble();
		System.out.println("Enter the pin of customer");
		pin = sc.next();
		System.out.println("Account sucessfully created");
	}

	double deposit_amount(double deposit) {
		balance = balance + deposit;
		System.out.println("Amount deposited sucessfully " + balance);
		return 0;

	}

	double withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount is sucessfully withdrawn " + balance);
		return 0;

	}

	void access_balance() {
		System.out.println("The balance is " + balance);
	}

	void access_name() {
		System.out.println("The name of the customer is " + name);
	}

	void valid_pin(String pin) {
		if (pin.length() <= 6) {
			System.out.println("The pin is valid");

		} else {
			System.out.println("Not valid ");
			System.out.println("Enter a valid pin less than 6");
			pin = sc.next();
			valid_pin(pin);
		}

	}

	void compute_fees() {
		System.out.println(0.1 * balance);
	}

	void compute_interest() {
		System.out.println(0.07 * balance);
	}

	void penalty() {
		System.out.println("No penalty for Interest Account");

	}
	void transaction()
	{
		double charge=0;
		System.out.println("Enter the number of transaction");
		int trans=sc.nextInt();
		for(int i=0;i<trans;i++)
		{
			charge=charge+10.00;
		}
		System.out.println("Charge for the transaction is "+charge);
	}
}


class CDAccount extends CheckingAccount {
	int months;

	void create_account() {
		System.out.println("Enter the name of customer");
		name = sc.nextLine();
		System.out.println("Enter the balance of this account");
		balance = sc.nextDouble();
		System.out.println("Enter the pin of customer");
		pin = sc.next();
		System.out.println("Account sucessfully created");
	}

	double deposit_amount(double deposit) {
		balance = balance + deposit;
		System.out.println("Amount deposited sucessfully " + balance);
		return 0;

	}

	double withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount is sucessfully withdrawn " + balance);
		return 0;

	}

	void access_balance() {
		System.out.println("The balance is " + balance);
	}

	void access_name() {
		System.out.println("The name of the customer is " + name);
	}

	void valid_pin(String pin) {
		if (pin.length() <= 6) {
			System.out.println("The pin is valid");

		} else {
			System.out.println("Not valid ");
			System.out.println("Enter a valid pin less than 6");
			pin = sc.next();
			valid_pin(pin);
		}

	}

	void compute_fees() {
		System.out.println(0.1 * balance);
	}

	void compute_interest() {
		System.out.println(0.15 * balance);
	}

	void penalty() {
		System.out.println("Enter the number of months until ur last transaction");
		months=sc.nextInt();
		if(months>12)
		{
			System.out.println("Penalty amount is "+0.2*balance);
		}
		else
		{
			System.out.println("No Penalty");
		}

	}

}

public class BankInheritance {
	public static void main(String[] args) {
		RegularAccount ra = new RegularAccount();
		ra.create_account();
		ra.deposit_amount(4000.25);
		ra.withdraw(8000.55);
		ra.access_balance();
		ra.access_name();
		ra.valid_pin(ra.pin);
		ra.compute_fees();
		ra.compute_interest();
		ra.penalty();
		InterestAccount ia=new InterestAccount();
		ia.create_account();
		ia.deposit_amount(5000.25);
		ia.withdraw(7000.55);
		ia.access_balance();
		ia.access_name();
		ia.valid_pin(ra.pin);
		ia.compute_fees();
		ia.compute_interest();
		ia.penalty();
		CheckingAccount ca=new CheckingAccount();
		ca.create_account();
		ca.deposit_amount(5000.25);
		ca.withdraw(7000.55);
		ca.access_balance();
		ca.access_name();
		ca.valid_pin(ra.pin);
		ca.compute_fees();
		ca.compute_interest();
		ca.penalty();
		CDAccount ca1=new CDAccount();
		ca1.create_account();
		ca1.deposit_amount(5000.25);
		ca1.withdraw(7000.55);
		ca1.access_balance();
		ca1.access_name();
		ca1.valid_pin(ra.pin);
		ca1.compute_fees();
		ca1.compute_interest();
		ca1.penalty();
		

	}
}
