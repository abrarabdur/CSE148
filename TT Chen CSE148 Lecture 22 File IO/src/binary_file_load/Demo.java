package binary_file_load;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("name.dat");
			DataInputStream dis = new DataInputStream(fis);
			double age = dis.readDouble();
			System.out.println("The age is: " + age);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
