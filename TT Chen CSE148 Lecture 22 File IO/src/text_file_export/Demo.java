package text_file_export;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "Doe", "CS", "3.5");
		Student s2 = new Student("Jane", "Doe", "CS", "3.5");
		Student s3 = new Student("Bill", "Doe", "CS", "3.5");
		Student s4 = new Student("Joey", "Doe", "CS", "3.5");
		
		Student[] students = {s1, s2, s3, s4};
		try {
			FileWriter fw = new FileWriter("students.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			for (int i = 0; i < students.length; i++) {
				pw.println(students[i].toString());
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
