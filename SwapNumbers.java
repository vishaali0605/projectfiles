public class SwapNumbers {
	static int a=10 ;
	int b =20;

	public static void main(String[] args) {
		SwapNumbers exam = new SwapNumbers();
		
		SwapNumbers.a=exam.b+SwapNumbers.a;
		exam.b=SwapNumbers.a-exam.b;
		SwapNumbers.a=SwapNumbers.a-exam.b;
		System.out.println(SwapNumbers.a);
		System.out.println(exam.b);
		
		

	}
}

