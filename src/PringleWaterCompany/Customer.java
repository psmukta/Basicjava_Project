package PringleWaterCompany;

import java.text.NumberFormat;

public class Customer {
	private int customerID;
	private int lastReading;
	private int newReading;
	private String SSP;
	private double totalTax;

	final double lineCharge= 8.00;
	final double SSPCharge=6.00;
	final double tax=.06;
	final double unitPrice=.08;
	final double unitPrice1=.07;
	final double unitPrice2=.05;
	
	public Customer(int id,String ssp) {
		this.customerID= id;
		this.SSP=ssp;
	}

	public double computeBill() {
		double totalUnitprice=0.00;
		int totalUnit=this.newReading - this.lastReading;
		if( totalUnit>=1 && totalUnit<200) {
			totalUnitprice=totalUnit*unitPrice;
			System.out.println("Total price is: "+ totalUnitprice);
		}
		else if(totalUnit>=200 && totalUnit<800) {
			totalUnitprice=totalUnit*unitPrice1;
			System.out.println("Total price is: "+ totalUnitprice);
		}
		else {
			totalUnitprice=totalUnit*unitPrice2;
			System.out.println("Total price is: "+ totalUnitprice);
		}
		double  totalbill=lineCharge+totalUnitprice;
		
		if(SSP.equals("yes")) {
			totalbill = totalbill+SSPCharge;
			if(totalbill>35) {
				totalbill = totalbill * (1-0.2);
			}
		}
		else {
		}
		
		this.totalTax= totalbill*tax;
		totalbill = totalbill+totalTax;
		return totalbill;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getLastReading() {
		return lastReading;
	}
	public void setLastReading(int lastReading) {
		this.lastReading = lastReading;
	}
	public int getNewReading() {
		return newReading;
	}
	public void setNewReading(int newReading) {
		this.newReading = newReading;
	}
	public String getSSP() {
		return SSP;
	}
	public void setSSP(String sSP) {
		SSP = sSP;
	}
	public double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
}
	
