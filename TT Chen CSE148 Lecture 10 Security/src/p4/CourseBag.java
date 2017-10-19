package p4;
import p3.*;
public class CourseBag {
	private Course[] courseArray;
	private int nElems;
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	public Course removeCourseWithHighestSalary() {
		double highestSalary = courseArray[0].getFaculty().getSalary();
		int highestSalaryIndex = 0;
		for(int i = 1; i < nElems; i++) {
			if(highestSalary < courseArray[i].getFaculty().getSalary()) {
				highestSalary = courseArray[i].getFaculty().getSalary();
				highestSalaryIndex = i;
			}
		}
		Course temp = courseArray[highestSalaryIndex];
		for(int j = highestSalaryIndex; j < nElems-1; j++){
			courseArray[j] = courseArray[j+1];
		}
		nElems--;
		return temp;
	}
	
	public Course findCourseWithHighestGPA(){
		double highestGPA = courseArray[0].getStudent().getGpa();
		int highestGPAIndex = 0;
		for(int i = 1; i < nElems; i++) {
			if(highestGPA < courseArray[i].getStudent().getGpa()){
				highestGPA = courseArray[i].getStudent().getGpa();
				highestGPAIndex = i;
			}
		}
		return courseArray[highestGPAIndex];
	}
	
	
	public void insert(Course course){
		courseArray[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
		System.out.println();
	}
}
