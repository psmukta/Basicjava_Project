package methodCallByValue;

public class CallByValue {

	public static void main(String[] args) {
		int value=10;
		System.out.println(value);
		CallByValue CAV=new CallByValue();
		CAV.displayByValue(value);

	}

	public void displayByValue( int value) {
		System.out.println("value display by method "+value);
		
		int value1=20;
		System.out.println("value display by method "+ value1);
		
	}

	
}
