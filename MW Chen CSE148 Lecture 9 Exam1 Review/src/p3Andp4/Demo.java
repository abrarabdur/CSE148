package p3Andp4;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", 4.0);
		Faculty f1 = new Faculty("Chen", 10);
		Course c1 = new Course("CSE148", s1, f1);
		System.out.println(f1);
		f1.setName("John Doe");
		System.out.println(f1);
		
		}

}
