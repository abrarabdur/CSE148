package inheritance;

import sample1.Name;

// subclass or child class
public class Student extends Person{

	private double gpa;

	public Student(String fName, String lName) {
		super(fName, lName);
	}

	public Student(String fName, char mInitial, String lName) {
		super(fName, mInitial, lName);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// overriding method
	public void commute() {
		System.out.println("Take a bus to school");
	}

	@Override
	public String toString() {
		return super.toString() + ", gpa=" + gpa;
	}

	

}
