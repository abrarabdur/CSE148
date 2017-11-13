package objectIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class LoadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data/students.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person[] students;
		students = (Person[])ois.readObject();
		
		System.out.println(Arrays.toString(students));
	}

}
