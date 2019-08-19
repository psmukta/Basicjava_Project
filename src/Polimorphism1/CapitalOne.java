package Polimorphism1;

public class CapitalOne implements Bank {

	@Override
	public void MoneyTransfer() {
		System.out.println("Can possible to money transfer to other bank"); 
		
	}

	@Override
	public void MoneyWithdraw() {
		System.out.println("Money withdraw is possible");
		
	}

	@Override
	public void creditcardinsert() {
		System.out.println("Customer can get credit card for use");
		
	}

	@Override
	public void ATM() {
		System.out.println("ATM for money withdrawing");
		
	}

}
