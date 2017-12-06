package object_load;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import object_save.Student;

public class Demo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("studentArrayobj.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student[] s = (Student[]) (ois.readObject());
			for(Student student : s) {
				System.out.println(student);
			}
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
