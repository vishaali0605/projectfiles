public class GreaterNumber {
	static int a = 20;
	int b = 50;

	public static void main(String[] args) {
		GreaterNumber gn= new GreaterNumber();
		int c = GreaterNumber.a > gn.b ? GreaterNumber.a : gn.b;
		System.out.println(c);

	}

}
