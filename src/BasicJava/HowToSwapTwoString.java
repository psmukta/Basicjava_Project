package BasicJava;

public class HowToSwapTwoString {

	public static void main(String[] args) {
		String S1="love";
		String S2="You";
		System.out.println("before   :"+S1+"  "+S2);
		//Concatenate both the string S1 and S2 and store it in S1
		S1=S1+S2;
		S2=S1.substring(0, S1.length()-S2.length());
		S1=S1.substring(S2.length());
		System.out.println("after   :"+S1+"  "+S2);
		

	}

}
