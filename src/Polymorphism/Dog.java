package Polymorphism;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eat meat");
		
	}

	@Override
	public void move() {
		System.out.println("Dog can move");
		
	}

}
