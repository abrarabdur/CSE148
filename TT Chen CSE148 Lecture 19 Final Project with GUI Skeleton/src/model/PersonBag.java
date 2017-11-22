package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PersonBag {
	private Person[] personArray;
	private int nElems;

	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void importStudentTextData() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(stage);
		if(file != null) {
			try {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String name = scanner.nextLine();
					Student s = new Student(name);
					insert(s);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void importFacultyTextData() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(stage);
		if(file != null) {
			try {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String name = scanner.nextLine();
					String title = scanner.nextLine();
					
					Faculty f = new Faculty(name, title);
					insert(f);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void exportStudentTextData() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showSaveDialog(stage);
		if (file != null) {

			PrintWriter pw = null;
			try {
				pw = new PrintWriter(file);
			} catch (FileNotFoundException e) {
				Util.failureAlert("Failure exporting Person data!");
			}
			for (int i = 0; i < nElems; i++) {
				Person person = personArray[i];
				if (person instanceof Student) {
					pw.println(person.toString());
				}
			}
			pw.close();
		}
	}
	
	public void exportFacultyTextData() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showSaveDialog(stage);
		if (file != null) {

			PrintWriter pw = null;
			try {
				pw = new PrintWriter(file);
			} catch (FileNotFoundException e) {
				Util.failureAlert("Failure exporting Person data!");
			}
			for (int i = 0; i < nElems; i++) {
				Person person = personArray[i];
				if (person instanceof Faculty) {
					pw.println(person.toString());
				}
			}
			pw.close();
		}
	}

	public void load() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("data/PersonBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			personArray = (Person[]) ois.readObject();
			nElems = (int) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
//			Util.failureAlert("Trouble finding PersonBag.dat");
		} catch (IOException e) {
			Util.failureAlert("Trouble loading PersonBag.dat");
		} catch (ClassNotFoundException e) {
			Util.failureAlert("Class not found exception occurred!");
		}

	}

	public void save() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("data/PersonBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(personArray);
			oos.writeObject(nElems);
			oos.close();
		} catch (FileNotFoundException e) {
			Util.failureAlert("Failure finding PersonBag.dat file!");
		} catch (IOException e) {
			Util.failureAlert("Failure saving PersonBag.dat file!");
		}

	}

	public void insert(Person person) {
		personArray[nElems++] = person;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}

	public Person removeById(String id) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (personArray[i].getId().equals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Person temp = personArray[i];
			for (int j = i; j < nElems - 1; j++) {
				personArray[j] = personArray[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Person findById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (personArray[i].getId().equals(id)) {
				return personArray[i];
			}
		}
		return null;
	}

}
