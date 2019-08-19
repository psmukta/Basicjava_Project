package PringleWaterCompany;

import java.text.NumberFormat;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c=new Customer(458,"yes");
		c.setLastReading(43020);
		c.setNewReading(43492);
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		NumberFormat percentage=NumberFormat.getPercentInstance();
		System.out.println("Customer Id: "+c.getCustomerID());
		System.out.println("Starting Unit: "+c.getLastReading());
		System.out.println("New Unit: "+c.getNewReading());
		System.out.println("Totaltaxable water bill is: "+dollar.format(c.computeBill()));
		System.out.println("Total tax is: "+dollar.format(c.getTotalTax())+" at "+percentage.format(c.tax));
		System.out.println("======================================================");
	}
}
