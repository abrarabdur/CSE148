package p3;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("CSE118", new Student("Adam", 4.0), new Faculty("Bill", 10));
		System.out.println(c1);
	}

}
