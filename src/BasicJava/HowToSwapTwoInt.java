package BasicJava;

import java.util.Scanner;

public class HowToSwapTwoInt {

	public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	int N1=sc.nextInt();
	System.out.println("enter  :");
	int N2=sc.nextInt();
	System.out.println("enter  :");*/
		
		int N1=10;
		int N2=5;
		N1=N1+N2;
		N2=N1-N2;
		N1=N1-N2;
		
		System.out.println("swap  :" +N1+" & "+N2);
	
	}

}
