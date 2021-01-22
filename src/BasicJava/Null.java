package BasicJava;

public class Null {

	public static void main(String[] args) {
		String str1=null;
		try{
			System.out.println(str1.length());
		}
		catch(NullPointerException e) {
			System.out.println(str1);
			
		}
			
		}

}
