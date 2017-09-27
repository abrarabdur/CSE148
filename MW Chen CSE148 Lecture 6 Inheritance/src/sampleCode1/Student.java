package sampleCode1;

import college.Name;

public class Student extends Person{

	private double gpa;

	public Student(Name name) {
		super(name);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + ", gpa=" + gpa;
	}
	
	

}
