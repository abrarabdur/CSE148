package textFileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data/data.txt", true);
		PrintWriter pw = new PrintWriter(fw); // wrapper class
		pw.write("Joe");
		pw.write("Jane");
		pw.close(); // flush the memory to the file
		
		File file = new File("data/data.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

}
