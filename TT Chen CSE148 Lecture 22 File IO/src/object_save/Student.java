package object_save;

import java.io.Serializable;

public class Student implements Serializable {
	private String firstName;
	private String lastName;
	private String major;
	private double gpa;

	public Student(String firstName, String lastName, String major, double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", major=" + major + ", gpa=" + gpa + "]";
	}

}
