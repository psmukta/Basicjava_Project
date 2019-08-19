package Temperature;

import java.util.Scanner;

public class TemperatureConvertur {

	public static void main(String[] args) {
		
		double cel, fahr;
		Scanner scan=new Scanner(System.in);
		System.out.println("celsius  ");
		cel=scan.nextDouble();
		 fahr= 1.8*cel +32;
		System.out.println("Today temperature is"+fahr);
	}

}
