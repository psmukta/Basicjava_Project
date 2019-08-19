package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsHirarchydemo {
	public double division(double a, double b) {
		double c=0;

		try {
			c=a/b;
			FileReader fr=new FileReader("text file");
			System.out.println("print");
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.getStackTrace();
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}
		
		
				public static void main(String[]args) {
			ExceptionsHirarchydemo ehd=new ExceptionsHirarchydemo();
			ehd.division(15,2);
	
	}
}
