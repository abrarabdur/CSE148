package binaryIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteLetters {

	public static void main(String[] args) throws IOException {
//		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		int[] numbers ={2, 4, 6, 8, 10, 12, 14};
		System.out.println("Open the file to write to: ");
		
		FileOutputStream fos = new FileOutputStream("numbers.dat", true);
		DataOutputStream dos = new DataOutputStream(fos);
		
//		dos.writeUTF("Hello World!");
		for(int num : numbers) {
			dos.writeInt(num);
			System.out.println(num);
		}
//		dos.writeUTF("Hello World!");
		dos.close();
		System.out.println("Done Writting!");
	}

}
