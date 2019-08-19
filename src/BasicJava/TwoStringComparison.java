package BasicJava;

public class TwoStringComparison {

	public static void main(String[] args) {
		String S1= "Selenium";
		String S2= "Selenium";
		String S3= new String("SELENIUM");
		String S4="JAVA";
		System.out.println(S1.equals(S2));//true
		System.out.println(S1.equals(S3));//false
		System.out.println(S1.equals(S4));//false
		System.out.println(S1.equalsIgnoreCase(S3));//true
		int a=S1.indexOf("e");//first position of e
		int b=S1.lastIndexOf("e");//last position of e
		System.out.println(a);
		System.out.println(b);
		String S="W3Schools";
		int ct=0;
		char[] cha=S.toCharArray();
		for(int i=0;i<S.length();i++) {
			for(int j=i+1;j<S.length();j++) {
				if(cha[i]==cha[j]) {
					System.out.println(cha[j]);
					ct++;
					break;
				}
			}
		}
			
		

	}

}
