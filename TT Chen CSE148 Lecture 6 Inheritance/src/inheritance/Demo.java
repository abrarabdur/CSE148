package inheritance;

import sample1.Name;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Joe" , "Doe");
		s1.getName().setmInitial('A');
		s1.name = new Name("Jane", "Doe");
		s1.commute();
		
		Person p1 = new Person("Jane", "Doe");
	}

}
