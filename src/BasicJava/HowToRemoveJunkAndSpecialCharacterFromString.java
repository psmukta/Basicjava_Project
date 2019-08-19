package BasicJava;

public class HowToRemoveJunkAndSpecialCharacterFromString {

	public static void main(String[] args) {
		String s="###Java$$$Selenium#$@^&&90";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println("print :"+s);

	}

}
