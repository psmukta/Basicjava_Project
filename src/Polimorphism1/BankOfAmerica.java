package Polimorphism1;

public class BankOfAmerica implements Bank {

	@Override
	public void MoneyTransfer() {
		System.out.println("Money transfer");
		
	}

	@Override
	public void MoneyWithdraw() {
	
		System.out.println(" Money withdraw");
	}

	@Override
	public void creditcardinsert() {
		
		System.out.println("Credit card insetr");
	}

	@Override
	public void ATM() {
		
		System.out.println("use for money withdraw");
	}

}
