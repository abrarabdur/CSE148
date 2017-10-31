package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			Scanner readFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Done");
		
//		String[] names = new String[10];
//		names[0] = "Adam";
//		names[1] = "Bill";
//		for(int i = 0; i < 2; i++) {
//			System.out.println(names[i]);
//			System.out.println(names[i].length());
//		}
//		System.out.println("Done");
//		
//		System.out.println(names[3]);
	}

}
