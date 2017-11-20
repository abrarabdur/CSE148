package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class PersonBag implements Serializable {
	
	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	/*
	 * save the personArray and nElems
	 */
	public void save(String fileName) {
		// to be completed
		
	}
	
	/*
	 * load the personArray and nElems
	 */
	public void load(String fileName) {
		File file = new File(fileName);
		if(file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				personArray = (Person[]) ois.readObject();
				nElems = (int) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * import person data from a text file
	 */
	public void importData(String fileName) {
		// to be completed
	}
	
	/*
	 * export person data to a text file
	 */
	public void exportData(String fileName) {
		// to be completed
	}

}
