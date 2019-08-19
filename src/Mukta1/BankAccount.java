package Mukta1;

public class BankAccount {
	int Balance;
	String Name;
	int Accountnumber;
	public BankAccount() {
		
	}
	public BankAccount( int Balance,String Name,int Accountnumber) {
		this. Balance=Balance;
		this. Name=Name;
		this.Accountnumber=Accountnumber;
	}
	public void deposit(int amount) {//method argument does not need to be declare 
		this.Balance=Balance+amount;
				
	}
	public void withdrow(int amount) {
		this.Balance=Balance-amount;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		Accountnumber = accountnumber;
	}
	@Override
	public String toString() {
		return "BankAccount [Balance=" + Balance + ", Name=" + Name + ", Accountnumber=" + Accountnumber + "]";
	}
	

}
