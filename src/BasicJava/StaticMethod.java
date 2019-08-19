package BasicJava;

public class StaticMethod {
     static int a=20;
     static int b=10;
    static int c;
     static int d=a-b;
     public static void main(String[] args) {
    	 add();
    	 sub();
     }
     public static void add() {
    	 c=a+b;
    	 System.out.println("Sum is :"+ c);
     }
     public static void sub() {
    	 System.out.println("Sub is :"+ d);
    	 
     }

}
