
public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal  animal=new Spider(8);
		animal.eat();
		animal.walk(8);
		Pet p1=new Cat(4);
		Animal a1=new Cat(4);
		a1.eat();
		a1.walk(4);
		p1.getName("Fluffy");
		p1.setName("Roger");
		p1.play();
		Animal a2=new Fish(0);
		a2.eat();
		a2.walk(0);
		
		
		

	}

}
