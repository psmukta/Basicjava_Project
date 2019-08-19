package Employee;

import java.util.Scanner;

public class EmployeeDetail {

	public static void main(String[] args) {
		String name;
		int hour;
		double payrate;
		double salary;
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your Name ?");
		name=scan.nextLine();
		System.out.println("how many hours work in a day?");
		hour=scan.nextInt();
		System.out.println("What is your payrate");
		payrate=scan.nextDouble();
		salary=hour*payrate;
		System.out.println("Salary"+salary);

	}

}
