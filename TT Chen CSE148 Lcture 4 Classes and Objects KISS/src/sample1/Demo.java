package sample1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		Course cse148 = new Course("CSE148", "Object Oriented Programming");
		
		//create a classroom 
		Classroom r212 = new Classroom("R212", 27, true);
		cse148.setClassroom(r212);
		
		// create a textbook
		Textbook javaBook = new Textbook("Intro to Java","123456789", 149.99);
		cse148.setTextbook(javaBook);
		
		// add an instructor
		cse148.setFaculty(new Faculty("Ben", "Chen"));
		cse148.getFaculty().setRank("Professor");
		cse148.getFaculty().setSalary(10000.99);
		cse148.getFaculty().getName().setmInitial('A');
		
		// create a bunch of students
		Student s1 = new Student("Adam",'s', "Family");
		Student s2 = new Student("Billy", "Joe");
		Student s3 = new Student("Cathy",'B', "Doe");
		Student s4 = new Student("John", "Doe");
		
		Student[] students = {s1, s2, s3, s4};
		
		cse148.setStudents(students);
		
		
		
		System.out.println(cse148);
		
		System.out.println("Student Information:");
		System.out.println(Arrays.toString(cse148.getStudents()));
	}

}
