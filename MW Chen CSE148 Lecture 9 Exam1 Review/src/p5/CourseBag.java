package p5;

import p3Andp4.*;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	public void insert(Course c){
		courseArray[nElems++] = c;
	}
	
	public void display() {
		System.out.println("Bag content: ");
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
		System.out.println();
	}
	
	public Course findCourseWithStudentWithHighestGPA(){
		double highestGPA = courseArray[0].getStudent().getGpa();
		int indexHighestGPA = 0;
		for(int i = 1; i < nElems; i++) {
			if(highestGPA < courseArray[i].getStudent().getGpa()) {
				highestGPA = courseArray[i].getStudent().getGpa();
				indexHighestGPA = i;
			}
		}
		return courseArray[indexHighestGPA];
	}
	
//	public Course removeCourseWithFacultyWithHighestSalary() {
//		int indexHighestSalary = 0;
//		double highestSalary = courseArray[0].getFaculty().getSalary();
//		
//	}
}
