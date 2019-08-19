

package BasicJava;

import java.util.Scanner;

public class BooleanClass {

	public static void main(String[] args) {
	
		        String user1="farzana1", pass1="nusrat123";
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the credential:");
				String user2= scan.next();
				System.out.println("enter the password");
				String pass2= scan.next();
				
				
				boolean status1=user1.equals(user2);
				boolean status2=pass1.equals(pass2);
				
				System.out.println("status1   :"+status1);
				System.out.println("status2   :"+status2);
				
				String result= status1==status2?"u Can Proceed":"invalid username or password";
				System.out.println("result"+result);
				
				
				
				
						

			}

		


	}


