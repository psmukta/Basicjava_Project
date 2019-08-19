package BasicJava;

public class HowToReverseInteger {

	public static void main(String[] args) {
		int num=123456789;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println("Reverse of given number : "+sb.reverse());
		String S="Selenium";
		StringBuffer sb1=new StringBuffer(String.valueOf(S));
		System.out.println("Reverse of given String "+sb1.reverse());
		
		String test ="abc";
		System.out.println("old text: "+test);
		
		String temp = changeText(test);
		System.out.println("new text: "+temp);
	}

	private static String changeText(String test) {
		test = "xyz";
		return test;
	}
	
	/*public static String changeText(String text) {
		return "xyz";
	}_*/

}
