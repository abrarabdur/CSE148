package object_save;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "Doe", "CS", 3.5);
		Student s2 = new Student("Jane", "Doe", "CS", 3.5);
		Student s3 = new Student("Bill", "Doe", "CS", 3.5);
		Student s4 = new Student("Joey", "Doe", "CS", 3.5);
		
		Student[] students = {s1, s2, s3, s4};
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("studentArrayobj.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(students);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
