package Mukta1;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount saving = new BankAccount (500,"John",001);
		System.out.println(saving.Balance);
		System.out.println(saving.Name);
		System.out.println(saving.Accountnumber);
		BankAccount checking=new BankAccount(6000,"jon",0006);
		saving.deposit(500);
		checking.withdrow(100);
		System.out.println("John's balance "+checking);
		System.out.println("John's balance "+saving);
		
	}
	
	 

}
