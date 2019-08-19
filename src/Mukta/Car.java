package Mukta;

public class Car {
	int numberofcardoor;
	int numberofseat;
	public Car() {
	}
	public Car(int numberofcardoor,int numberofseat) {
		this.numberofcardoor=numberofcardoor;
		 this.numberofseat=numberofseat;
	}
	public void move() {
		System.out.println("Car can move.");
	}
	
	public int getNumberofcardoor() {
		return numberofcardoor;
	}
	public void setNumberofcardoor(int numberofcardoor) {
		this.numberofcardoor = numberofcardoor;
	}
	public int getNumberofseat() {
		return numberofseat;
	}
	public void setNumberofseat(int numberofseat) {
		this.numberofseat = numberofseat;
	}
	@Override
	public String toString() {
		return "Car [numberofcardoor=" + numberofcardoor + ", numberofseat=" + numberofseat + "]";
	}
	

}
