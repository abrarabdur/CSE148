package objectIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveDemo {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student("Adam", "111", "M");
		Student s2 = new Student("Suzy", "222", "F");
		Student s3 = new Student("Johnny", "333", "M");

		Person[] students = { s1, s2, s3 };

		FileOutputStream fos = new FileOutputStream("data/students.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
		System.out.println("Done writing students array!");

	}

}
