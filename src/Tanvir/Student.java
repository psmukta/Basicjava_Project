package Tanvir;

public class Student {
	private int roolnumber;//these three  are instance variable , they are unique to each instance of class
	private String Studentname;
	private int phonenumber;
	public static int count=0;//this is a class variable
	//static variable must be initialized before it can be used
	//static variable can be access by the class name as well as by the instance.
	//static members can not access instance members
	//static members may exist even without instance of the class
	public Student() {
	}		
	public Student(int roolnumber, String studentname) {
		this.roolnumber = roolnumber;
		this.Studentname = studentname;
	}
	public Student(int roolnumber, String studentname, int phonenumber) {
		this.roolnumber = roolnumber;
		this.Studentname = studentname;
		this.phonenumber = phonenumber;
	}
	
	public int getRoolnumber() {
		return roolnumber;
	}
	public void setRoolnumber(int roolnumber) {
		this.roolnumber = roolnumber;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Student [roolnumber=" + roolnumber + ", Studentname=" + Studentname + ", phonenumber=" + phonenumber
				+ "]";
	}
	public String getDescription() {
		return "Deatil Info: roolnumber=" + roolnumber + ", Studentname=" + Studentname + ", phonenumber=" + phonenumber;
	}
}
