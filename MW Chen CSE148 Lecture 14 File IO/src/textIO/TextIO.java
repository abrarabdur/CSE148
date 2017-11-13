package textIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIO {

	public static void main(String[] args) throws IOException {
		// create or save info to a text file
		FileWriter fw = new FileWriter("data/output.txt"); // true: append
		PrintWriter pw = new PrintWriter(fw, true); // wrapper class. true means autoflush
		pw.println("人");
//		pw.write("John");
		pw.close(); // time to write to the file: flush
		
		
		// read from a text file
		File file = new File("data/output.txt");
		Scanner out = new Scanner(file);
		while (out.hasNextLine()) {
			String name1 = out.nextLine();
//			String[] nameTokens = name1.split("[. ]+");
//			Name name = new Name(nameTokens[0], nameTokens[1], nameTokens[2]);
//			String phone = out.nextLine();
//			String address = out.nextLine();
			System.out.println(name1);
		}
		out.close();
	}

}
