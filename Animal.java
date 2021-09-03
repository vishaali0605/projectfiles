
abstract class Animal {
	protected int legs;

	protected Animal(int legs) {
		this.legs = legs;
	}

	public abstract void eat();

	public abstract void walk(int legs);

}

class Spider extends Animal {

	protected Spider(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void eat() {
		System.out.println("Spider eats  insects");

	}

	@Override
	public void walk(int legs) {
		// TODO Auto-generated method stub
		System.out.println("The spider has " + legs);

	}

}

class Cat extends Animal implements Pet {
	String name;

	protected Cat(int legs) {
		super(legs);

		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String setName(String name) {
		return this.name = name;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		System.out.println("Cat likes to play ball");
		return null;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat likes to eat fish");

	}

	@Override
	public void walk(int legs) {
		// TODO Auto-generated method stub
		System.out.println("The cat walks with " + legs);

	}



	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return null;
	}

}

class Fish extends Animal {
	protected Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish liskes to eat small insects");

	}

	@Override
	public void walk(int legs) {
		// TODO Auto-generated method stub
		System.out.println("Fish does not have any legs to walk " + legs);

	}

}
