package randomAccessFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteLetters {

	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("Opening the file to write...");
		try {
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "rw");
			System.out.println("Writing to the file ...");
			for (int j = 0; j < letters.length; j++) {
				randomFile.writeChar(letters[j]);
			}
			randomFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
	}

}
