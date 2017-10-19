package p3;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 3.5);
		Faculty f1 = new Faculty("Zack", 100);
		Course c1 = new Course("CSE148", s1, f1);
		Student s2 = c1.getStudent(); // deep copy
		s2.setName("Bill");
		Faculty f2 = c1.getFaculty(); // deep copy
		f2.setName("Chen");
		String t2 = c1.getTitle();
		t2 = "CSE218";
		System.out.println(c1);
	}

}
