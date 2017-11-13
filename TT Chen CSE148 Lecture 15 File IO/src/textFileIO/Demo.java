package textFileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("data/data.txt", true);
//		PrintWriter pw = new PrintWriter(fw); // wrapper class
//		pw.write("Joe");
//		pw.write("Jane");
//		pw.close(); // flush the memory to the file
		
		File file = new File("data/Students.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String[] name = input.nextLine().split(" "); // name
//			Name name = new Name(tokens[0], tokens[1]);
			String[] tokens = input.nextLine().split("[,]? "); // address
			String[] address = {tokens[0], tokens[1] + " " + tokens[2], tokens[3], tokens[4], tokens[5]};
			String phone = input.nextLine(); // phone
			String major = input.nextLine(); // major
			System.out.println(Arrays.toString(name));
			System.out.println("\t" + Arrays.toString(address));
			System.out.println("\t" + phone);
			System.out.println("\t" + major);
		}
		input.close();
	}

}
