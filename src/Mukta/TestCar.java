package Mukta;

public class TestCar {

	public static void main(String[] args) {
		Car toyota=new Car(4,5);
		System.out.println(toyota.getNumberofseat());
		Car BMW =new Car();
		BMW.setNumberofcardoor(4);
		BMW.setNumberofseat(5);
		BMW.move();
		System.out.println(BMW.getNumberofcardoor());
	}

}
