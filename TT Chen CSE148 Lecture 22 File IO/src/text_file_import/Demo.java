package text_file_import;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		File file = new File("students.txt");
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String studentInfo = in.nextLine();
//				System.out.println(studentInfo);
				String[] t = studentInfo.split(", ");
				System.out.println(t[3] + "\t" + t[2]+ "\t" + t[1] + "\t" + t[0]);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
