package binaryIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {
		
		boolean endOfFile = false;
		int number;
		FileInputStream fis = new FileInputStream("numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		while(!endOfFile) {
			try {
				number = dis.readInt();
				System.out.print(number + " ");
			} catch (IOException e) {
				endOfFile = true;
			}
		}
		dis.close();
		System.out.println("Done reading!");
		
	}

}
