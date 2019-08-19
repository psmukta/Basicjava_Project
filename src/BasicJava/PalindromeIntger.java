package BasicJava;

public class PalindromeIntger {
	public void isPalindromeNumber(int num ) {
		//int num = 121;
		int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
           num =num/10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }

	
	public static void main(String[]args) {
		PalindromeIntger revp=new PalindromeIntger();//same name with class
		revp.isPalindromeNumber(121);
	}
	
}

