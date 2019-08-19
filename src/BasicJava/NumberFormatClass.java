package BasicJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFormatClass {
	public static void main(String[] arg) {
		double tax=.07;
		double  unitprice;//=10.43;
		int quantity;//=10;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Item unit price : ");
		unitprice=scan.nextDouble();
		System.out.println("Enter Item Quantity : ");
		quantity=scan.nextInt();
		double subtotalPrice=unitprice*quantity;
		double totaltax=subtotalPrice*tax;
		double totalprice=subtotalPrice+totaltax;
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		NumberFormat percentage=NumberFormat.getPercentInstance();//get percent instance
		System.out.println("Total Price is    " +dollar.format(totalprice) +"    at   "+percentage.format(tax)+"    Tax");//get double
		
	}

}
