package BasicJava;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HomeWork4 {

	public static void main(String[] args) {
		String FirstName;
		String LastName;
		String MiddleIn;
		String input;
		Scanner scan=new Scanner(System.in);
		input=JOptionPane.showInputDialog("First Name");
		FirstName=String.valueOf(input);
		input=JOptionPane.showInputDialog("Last Name");
		LastName=String.valueOf(input);
		input=JOptionPane.showInputDialog("Middle Name");
		MiddleIn=String.valueOf(input);
		System.out.println("Full Name :"+FirstName+" "+MiddleIn.charAt(0)+" "+LastName);
		JFrame frame=new JFrame("JOptionPane showMessage Dialog ");
		JOptionPane.showMessageDialog(frame, " Name : "+FirstName +"  "  + MiddleIn.charAt(0)+"  "  +LastName);
		System.exit(0);
	}

}
