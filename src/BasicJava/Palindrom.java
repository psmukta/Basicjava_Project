package BasicJava;

import java.util.Scanner;

public class Palindrom {
	public static void main (String[] args) {
		String original, reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--) {
	    	  System.out.println("old: "+reverse);
		         reverse = reverse + original.charAt(i);
		    	  System.out.println("after add: "+reverse+"\n---------------");
	      }
	      
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	   }
	}


