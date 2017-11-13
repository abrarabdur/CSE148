package binaryIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveDemo {

	public static void main(String[] args) throws IOException {
		int[] numbers ={1, 2, 3, 4, 5};
		FileOutputStream fos = new FileOutputStream("data/numbers.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		for(int i = 0; i < numbers.length; i++) {
			dos.writeInt(numbers[i]);
		}
		dos.close();
		System.out.println("Done writing!");
	}

}
