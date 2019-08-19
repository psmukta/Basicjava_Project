package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;



public class TryAndCatchHandle {

	public void fileAccess() {
		try {
			FileReader fr=new FileReader("Test");
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());

		}
		
		finally {
			
			System.out.println("Run");
		}
	}
	
	
	public static void main (String[] args) {
		TryAndCatchHandle tch=new TryAndCatchHandle();
		tch.fileAccess();
		
	}

}
