package Polimorphism1;

public class Test {

	public static void main(String[] args) {
		
		
		Bank co=new CapitalOne();
		co.ATM();
		co.creditcardinsert();
		co.MoneyTransfer();
		BankOfAmerica boa=new BankOfAmerica();
		boa.MoneyWithdraw();
		boa.creditcardinsert();
		System.out.println("==========================");
		
		
				
				
				
		

	}

}
