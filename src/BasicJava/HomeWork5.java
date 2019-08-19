package BasicJava;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeWork5 {

	public static void main(String[] args) {
		String input;
		double weight;
		final double tax=.08;
		double unitprice=0;
		/*double unitprice1=1.10;
		double unitprice2=2.20;
		double unitprice3=3.70;
		double unitprice4=4.20;
		double unitprice5=4.50;*/
		double Totalcharge;
		//Scanner Scan=new Scanner(System.in);not necessary for jOptionPane
		input=JOptionPane.showInputDialog("Enter the Weight");
		weight=Double.parseDouble(input);
		
		if(weight<=2) {
			unitprice=1.10;
			
		}
		else if(weight>2 && weight<=6) {
			unitprice=2.20;
			
		}
		
		else if(weight>6 && weight<=10) {
			unitprice=3.70;
			
		}
		else if(weight>10 && weight<=15) {
			unitprice=4.20;
			
			
		}
		else if (weight>15) {
			unitprice=4.50;
			
		}
		double TotalTax = unitprice*tax;
		Totalcharge=unitprice+TotalTax;
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		System.out.println("Total Charge is  :"+dollar.format(Totalcharge));
		JFrame frame=new JFrame("JOptionPane showMessageDialog");
		JOptionPane.showMessageDialog(frame,"Weight in pound :"+ weight+"  lb"     
		+"\n"+ "Tax  :"+dollar.format(TotalTax)  
		+"\n" + "Total shipping charge  "+dollar.format(Totalcharge));

	}

}
