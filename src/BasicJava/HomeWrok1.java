package BasicJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWrok1 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float sum_three;
		float product_three;
		float average_three;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number :  ");
		a = scan.nextFloat();
		System.out.println("Enter second number :  ");
		b = scan.nextFloat();
		System.out.println("Enter third number :  ");
		c = scan.nextFloat();
		sum_three = sum(a, b, c);
		System.out.println("Sum is: "+sum_three);
		product_three = product(a, b, c);
		DecimalFormat df=new DecimalFormat("###.##");
		System.out.println("Product is  "+df.format(product_three));
		average_three=average(a,b,c);
		System.out.println("Average is "+average_three);
	}

	public static float sum(float a, float b, float c) {
		return (a + b + c);
	}

	public static float product(float a, float b, float c) {
		return a*b*c;
	}

	public static float average(float a, float b, float c) {
		return (a + b + c) / 3;
	}
}
