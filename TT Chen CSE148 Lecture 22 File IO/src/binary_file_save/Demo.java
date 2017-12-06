package binary_file_save;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		double age = 3.5;
		try {
			FileOutputStream fos = new FileOutputStream("name.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeDouble(age);
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
