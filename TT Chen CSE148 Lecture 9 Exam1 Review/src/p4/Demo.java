package p4;

import p3.*;

public class Demo {

	public static void main(String[] args) {
		CourseBag myBag = new CourseBag(10);
		myBag.insert(new Course("CSE118", new Student("Adam", 3.5), new Faculty("Bill", 10)));
		myBag.insert(new Course("CSE148", new Student("Cathy", 4.0), new Faculty("Kevin", 20)));
		myBag.insert(new Course("CSE218", new Student("Zack", 2.5), new Faculty("Chen", 5)));
		// System.out.println(myBag.findCourseWithHighestGPA());
		System.out.println("Bag content before removal: ");
		myBag.display();
		System.out.println("The course removed: ");
		System.out.println(myBag.removeCourseWithHighestSalary());
		System.out.println("Bag content after removal");
		myBag.display();

	}

}
