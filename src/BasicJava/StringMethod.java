package BasicJava;

public class StringMethod {

	public static void main(String[] args) {
		 //String ToUpperCase() and ToLowerCase()
        String s1="Selenium";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        // String Trim()

        System.out.println(s1.startsWith("eSe"));
        System.out.println(s1.endsWith("umn"));
        System.out.println(s1.startsWith("Se"));
        System.out.println(s1.endsWith("um"));
        // String CharAt()
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(6));//java start with 0


        //String Length()

        System.out.println(s1.length());

       // String ValueOf

        int a=10;
        String s2=String.valueOf(a);
        System.out.println(s2);


        //String Repleace()

        String s3="Java is a programming language, Java is platform, Java is an island";
        System.out.println(s3.replace("Java","kabha"));//replace (oldchar,new char)

            //Split Method()
        String s4="Java is programming language";
       String [] words=s4.split("  ");//string Arrey
        for(String w:words){
            System.out.println(w);
        }




    }



	}


