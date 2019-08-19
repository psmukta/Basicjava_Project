package Tanvir;

public class TestStudent {
	public static void main(String[] args) {
		/*Student areeb = new Student(1, "Areeb", 123456789);
		System.out.println("---------------------------");
		System.out.println("Areeb Info: "+areeb.toString());
		System.out.println("Another way: "+areeb.getDescription());
		*/

		//q1. create an Strudent object name zunairah and prinout the information of Zunairah
		
		Student zunairah=new Student(2,"Zunairah",4567832);
		System.out.println("Zunairah info  "+zunairah.getDescription());
		Student unknown = new Student();
		//q2. given a name, roll number, phonenumber to unknown
		unknown.setStudentname("Alam");
		unknown.setRoolnumber(5);
		unknown.setPhonenumber(3467);
		//q3. prinout the information of unknown
		System.out.println("Unknown student info  "+unknown.toString());		
	}
}
