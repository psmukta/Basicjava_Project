package BasicJava;

public class HowToReverseInteger {

	public static void main(String[] args) {
		int num=123456789;
		String p = num+"";
		
		System.out.println(p);
		System.out.println("-1----------");
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		System.out.println(sb);
		
		System.out.println("-2----------");
		System.out.println("Reverse of given number : "+sb.reverse());
		String S="Selenium";
		String S1="racecar";
		StringBuffer sb1=new StringBuffer(String.valueOf(S));
		StringBuffer sb2= new StringBuffer(String.valueOf(S1));
		//System.out.println("Reverse of given String "+sb1.reverse());
		System.out.println("Reverse of given String:  "+sb2.reverse());
		String test ="abc";
		System.out.println("old text: "+test);
		
		String temp = changeText(test);
		System.out.println("new text: "+temp);
		
		int n1=125;
		StringBuffer nsb=new StringBuffer(String.valueOf(n1));
		nsb.reverse();//Two bufferString can not do compair
		                               //bufferString change to String
		System.out.println("n1: "+n1);
		System.out.println("nsb: "+nsb);
		if((n1+"").equals(nsb.toString())) {
			System.out.println("1.Palindrom");	
			//System.out.println("they are same");
		}
	}

	private static String changeText(String test) {
		test = "xyz";
		return test;
	}
	
	/*public static String changeText(String text) {
		return "xyz";
	}_*/

}
