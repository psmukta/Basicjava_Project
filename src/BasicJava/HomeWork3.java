package BasicJava;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeWork3 {

	public static void main(String[] args) {
		String cityname;
		String input;
		Scanner scan=new Scanner(System.in);
		input=JOptionPane.showInputDialog("What is your favorite city? ");
		cityname=String.valueOf(input);
		System.out.println("The City Name  :"+cityname);
		System.out.println("The Number of characters in the city name : "+cityname.length());
		System.out.println("The Name of the city in all Uppercase letters  :" +cityname.toUpperCase());
		System.out.println("The Name of the city in all Lowercase letters : " +cityname.toLowerCase());
		System.out.println("The first character in the name of the city  :" +cityname.charAt(0));
		JFrame frame=new JFrame("JOptionPane showMessageDialog");
		JOptionPane.showMessageDialog(frame, "City name :  "+cityname 
		+"\n" + "Number of char :" +cityname.length()
		+"\n" + "Uppercase :" +cityname.toUpperCase()
		+"\n"+"Lowercase :"+cityname.toLowerCase()
		+"\n"+"FirstChar :"+cityname.charAt(0));
	}
}
