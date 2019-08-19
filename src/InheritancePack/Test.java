package InheritancePack;

public class Test {

	public static void main(String[] args) {
		Car c=new Car();
	     System.out.println("Total Door:"+c.NoOfDoor);
		PoliceCar pc=new PoliceCar();
		System.out.println("Total Door of police car:"+pc.NoOfDoor);
		RacingCar rc=new RacingCar();
	     System.out.println("Number of seat of racing car:"+rc.NoOfSeat);
	    pc.move();
	    rc.stop();
	}

}
