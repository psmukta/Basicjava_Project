package BasicJava;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PringleWater {

	public static void main(String[] args) {
		int customerID;   //=458;
		int lastReading;  //=43020;
		int newReading ;  //=43492;
		
		String SSP;
		String input;
		final double lineCharge= 8.00;
		final double tax=.06;
		
		double SSPCharge=6.00;
		double unitPrice=.08;
		double unitPrice1=.07;
		double unitPrice2=.05;
		double totalUnitprice=0;
		Scanner scan=new Scanner(System.in);
		input=JOptionPane.showInputDialog("Enter Customer ID");
		customerID=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("Enter Customer lastReading");
		lastReading=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("Enter Customer newReading");
		newReading=Integer.parseInt(input);
		int totalUnit=newReading-lastReading;
		
		if( totalUnit>=1 && totalUnit<200) {
			totalUnitprice=totalUnit*unitPrice;
			//System.out.println("Total price is: "+ totalUnitprice);
		}
		else if(totalUnit>=200 && totalUnit<800) {
			totalUnitprice=totalUnit*unitPrice1;
			//System.out.println("Total price is: "+ totalUnitprice);
		}
		else {
			totalUnitprice=totalUnit*unitPrice2;
			//System.out.println("Total price is: "+ totalUnitprice);
		}


		input=JOptionPane.showInputDialog("Is customer supper saver?");
		SSP=String.valueOf(input);
		double  totalbill=lineCharge+totalUnitprice;

		if(SSP.equalsIgnoreCase ("yes")) {
			totalbill = totalbill+SSPCharge;
			
			if(totalbill>35) {
				totalbill = totalbill * (1-0.2);
				double discount=totalbill*(1-0.8);
				NumberFormat dollar=NumberFormat.getCurrencyInstance();
				System.out.println("discount   :"+dollar.format(discount));
			}
		}
		else if(SSP.equalsIgnoreCase("no")) {
			totalbill=lineCharge+totalUnitprice;
		}
		
		double taxableBill= totalbill*tax;
		totalbill = totalbill+taxableBill;
		
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		NumberFormat percentage=NumberFormat.getPercentInstance();
		System.out.println("Total tax is "+dollar.format(taxableBill)) ;
		System.out.println("Totaltaxable water bill is "+dollar.format(totalbill)+ "  at  "+percentage.format(tax)+"  Tax");

			JFrame frame=new JFrame("JOptionPane showMessageDialog");
			JOptionPane.showMessageDialog(frame, "Final Water Bill :"+ dollar.format(totalbill));

	}

}
