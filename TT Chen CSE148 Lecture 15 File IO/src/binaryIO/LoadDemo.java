package binaryIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class LoadDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data/numbers.dat");
		DataInputStream dis = new DataInputStream(fis);
		int[] numbers = new int[5];
		for(int i = 0; i < 5; i++) {
			numbers[i] = dis.readInt();
		}
		System.out.println(Arrays.toString(numbers));
		dis.close();
		System.out.println("Done reading!");
		
	}

}
