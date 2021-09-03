public class ArithmeticOperation
{
     int num1=100;
     static int num2 = 5;
    public static void main(String[] args) {
	    ArithmeticOperation m=new ArithmeticOperation();
	    int x=m.num1;
	    int y=ArithmeticOperation.num2;
	    System.out.println("Sum of two numbers");
	    while (num2 != 0){
            int carry = (m.num1 & num2) ; 
            m.num1 = m.num1 ^ num2; 
            num2 = carry << 1; 
        }
		System.out.println(m.num1);
		System.out.println("Difference of two numbers");
		while (y != 0)
        {
        int borrow = (~x) & y;
        x = x ^y;
        y = borrow << 1;
        }
        System.out.println(x);
	}
}