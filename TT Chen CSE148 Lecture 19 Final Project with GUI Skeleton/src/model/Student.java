package model;

public class Student extends Person {
	private double gpa;

	public Student(String name) {
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
		return "Student [Name=" + getName() + ", ID=" + getId() + ", "
				+ "Phone=" + getPhone() + ", GPA=" + gpa + "]";
	}

}
