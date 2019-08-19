package BasicJava;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeWork2 {

	public static void main(String[] args) {
		final double tax=.0675;
		final double tip=.15;
		double bill;
		String input;
		Scanner scan=new Scanner(System.in);
		input=JOptionPane.showInputDialog("What is the meal charge ? ");
		bill=Double.parseDouble(input);
		/*input=JOptionPane.showInputDialog("Tax is ");
		tax=Double.parseDouble(input);
		input=JOptionPane.showInputDialog("Tip is ");
		tip=Double.parseDouble(input);*/
		double Tax=bill*tax;
		double Totalbill=bill +Tax;
		double Totaltip=Totalbill*tip;
		double Finalbill=Totalbill+Totaltip;
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		NumberFormat percentage=NumberFormat.getPercentInstance();
		percentage.setMinimumFractionDigits(2);
		System.out.println("Meal charge "+dollar.format(bill));
		System.out.println(" Tax amount  "+dollar.format(Tax));
		System.out.println("Tip amount  "+dollar.format(Totaltip));
		System.out.println(" Final bill   "+dollar.format(Finalbill) +" at "+percentage.format(tax)+"  Tax");
		JFrame frame=new JFrame("JOptionPane showMessageDialog");
		JOptionPane.showMessageDialog(frame, "Final bill  "+dollar.format(Finalbill)
		+"\n"+"Meal charge "+dollar.format(bill)
		+"\n"+"Tax Amount "+dollar.format(bill)
		+"\n"+"Tip Amount "+dollar.format(bill));
	}

}
