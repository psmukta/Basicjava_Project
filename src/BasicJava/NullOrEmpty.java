package BasicJava;

public class NullOrEmpty {

	public static void main(String[] args) {
		
		String x1=null;
		boolean res;
		res=((x1==null) ||(x1.length()==0));
		System.out.println(res);
		System.exit(0);//rest of code will not execute
		if((x1==null) ||(x1.length()==0))
		System.out.println(res);
	}

}
