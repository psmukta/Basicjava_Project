package BasicJava;

public class StringSplit {

	public static void main(String[] args) {
		String mail="psmukta@yahoo.com";
		/*String[] split=mail.split(mail);
		for(String sp:split) {
			System.out.println(sp);
			
		}*/
		String name="Parveen Sultana";
		System.out.println(mail.endsWith("com"));
		System.out.println(mail.charAt(7));
		System.out.println(mail.charAt(13));
		System.out.println(mail.indexOf("@"));
		System.out.println(mail.indexOf("."));
		int indexOfAt=mail.indexOf("@");
		int indexOfDot=mail.indexOf(".");
		 int indexOfDot1=mail.lastIndexOf(".");
		String emailName=mail.substring(0, indexOfAt);
		System.out.println(emailName);
		String provider=mail.substring(indexOfAt+1, 13);
		String domain=mail.substring(indexOfDot1+1);
		System.out.println(provider);
		System.out.println(domain);
		String[] NM=name.split(" ");
		//String[] sp1=NM;
		//String[] sp1=NM;
		System.out.println(NM[0]);
		//System.out.println(sp1[0]);
		for(String sp:NM) {
			System.out.println(sp);
		}
	
		
	}

}
