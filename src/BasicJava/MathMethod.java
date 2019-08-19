package BasicJava;

public class MathMethod {

	 public static void main(String[] args){
	        double x=50;
	        double y=30;
	        int a=5;
	        int b= 10;
	        // Maximum of two number
	        System.out.println("Maximum Number is "+Math.max(x, y));
	        double random=Math.random();
	        double z=5.6;
	        double c=4;
	        System.out.println("Ceiling value is "+Math.ceil(z));
	        System.out.println("Floor value is "+Math.floor(z));
	        System.out.println("Random value is "+Math.random());
	        System.out.println("Round value is "+Math.round(z));
	        System.out.println("NextAfter value is "+Math.nextAfter(z,random));
	        System.out.println("NextDown value is "+Math.nextDown(z));
	        System.out.println("NextUp value is "+Math.nextUp(z));
	        System.out.println("Squireroot value is "+Math.sqrt(c));
	        System.out.println("Sum value is "+Math.addExact(a, b));
	    }
		

	}


