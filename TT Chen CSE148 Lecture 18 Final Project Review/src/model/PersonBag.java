package model;

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
		// to be completed
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
