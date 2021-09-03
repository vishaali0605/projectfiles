
class AllOperators
{ 
   public static void main(String[] args)
   {
      int a=50,b=55;
      System.out.println("The sum of two numbers: "+(a+b));   
      System.out.println("The difference of two numbers: "+(a-b)); 
      System.out.println("The product of two numbers: "+(a*b));
      System.out.println("The quotient of two numbers: "+(a/b));
      System.out.println("The modulo of two numbers: "+(a%b)); 
      int result=a>b?a:b;
      System.out.println("The Conditional Operator: "+result);
      System.out.println("The Short hand operator: "+(a+=b)+" "+(a-=b)+" "+(a*=b)+" "+(a/=b));
      System.out.println("The pre-incerment of two numbers: "+(++a)+" "+(++b));  
      System.out.println("The pre-decrement of two numbers: "+(--a)+" "+(--b)); 
      System.out.println("The post-incerment of two numbers: "+(a++)+" "+(b++));
      System.out.println("The post-decerment of two numbers: "+(a--)+" "+(b--));
      System.out.println("The relational operation of two numbers: "+(a>b)+" "+(a<b)+" "+(a==b)+" "+(a!=b)+" "+(a>=b)+" "+(a<=b));
      System.out.println("The Bitwise operation of two numbers: "+(a&b)+" "+(a|b)+" "+(a^b));
      System.out.println("The Bitwise operation of two numbers: "+(a<<b)+" "+(a>>b)+" "+(~a));
   }
}
