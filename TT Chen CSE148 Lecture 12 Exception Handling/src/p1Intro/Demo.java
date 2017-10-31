package p1Intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Adam";
		names[1] = "Bill";
		
		// NullPointerException
		
		for(int i = 0; i < names.length; i++) {
			try {
			System.out.println(names[i].length());
			} catch (NullPointerException e) {
//				System.out.println("Encountered a null pointer exception");
			}
		}
		System.out.println("End");
		
		// ArrayIndexOutOfBoundsException
//		System.out.println(names[10]);
		
//		File file = new File("data.txt");
//		try {
//			Scanner scanner = new Scanner(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}

}
