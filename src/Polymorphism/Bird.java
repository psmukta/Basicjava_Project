package Polymorphism;

public class Bird implements Animal {

	@Override
	public void eat() {
		
	System.out.println("Bird can eat corn");	
	}

	@Override
	public void move() {
		
		System.out.println("Bird can fly");
	}

}
