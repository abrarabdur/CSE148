package randomAccessFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadLetters {

	public static void main(String[] args) {
		final int CHAR_SIZE = 2;
		long byteNum;
		char ch;
		
		try {
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "r");
			byteNum = CHAR_SIZE * 2;
			randomFile.seek(byteNum);
			ch = randomFile.readChar();
			randomFile.seek(2);
			ch = randomFile.readChar();
			System.out.println(ch);
			randomFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally we are here.");
		}
	}

}
