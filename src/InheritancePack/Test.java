package InheritancePack;

public class Test {

	public static void main(String[] args) {
	    Car pc=new PoliceCar();
		System.out.println("Total Door of police car:"+pc.NoOfDoor);
		Car rc=new RacingCar();
	     System.out.println("Number of seat of racing car:"+rc.NoOfSeat);
	    pc.move();
	    rc.stop();
	    
	    System.out.println("==============");
	    Car c0 = new Car();
	    c0.move();
	    c0.stop();
	    PoliceCar pc0 = new PoliceCar();
	    pc0.move();
	    pc0.stop();
	    Car pc1 =  new PoliceCar();
	    pc1.move();
	    pc1.stop();
	    pc1 = new RacingCar();
	    pc1.move();
	    pc1.stop();
	   
	}

}
