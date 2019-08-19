package methodCallByValue;

public class CallByReference {

	public static void main(String[] args) {
		String[] name= {"john","pol","cal","mol"};
		CallByReference CBR=new CallByReference();
		//CBR.displayByReference(name);
		System.out.println(name[1]);//call by reference

	}
	
	public void displayByReference(String[] name) {
		for(String Name:name) {
			System.out.println(Name);	
		}
		name[1]="zun";
		
	}

}
