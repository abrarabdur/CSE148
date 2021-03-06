package p1;

import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;
	private Scanner kb = new Scanner(System.in);

	public Student(String name, double gpa)  {
		super();
		this.name = name;
		checkGPA(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		checkGPA(gpa);
	}
	
	private void checkGPA(double gpa) {
		if (gpa < 0.0) {
			try {
				throw new GPATooSmallException("GPA cannot be smaller then 0.0!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Re-Enter a valid GPA: ");
				setGpa(kb.nextDouble());
			} finally {
				System.out.println("I am doing finally clause");
			}
		
		} else if (gpa > 4.0) {
			try {
				throw new GPATooBigException("GPA cannot be greater than 4.0!");
			} catch (GPATooBigException e) {
				System.out.println(e.getMessage());
				System.out.println("Re-Enter a valid GPA: ");
				setGpa(kb.nextDouble());

			}
			
		} else {
			this.gpa = gpa;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
