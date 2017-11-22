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

public class TextbookBag {
	private Textbook[] textbookArray;
	private int nElems;
	
	public TextbookBag(int maxSize) {
		textbookArray = new Textbook[maxSize];
		nElems = 0;
	}

	public void importTextbookTextData() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(stage);
		if(file != null) {
			try {
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String title = scanner.nextLine();
					String isbn = scanner.nextLine();
					double price = Double.parseDouble(scanner.nextLine());
					Textbook t = new Textbook(title, isbn, price);
					insert(t);
				}
			} catch (FileNotFoundException e) {
				Util.failureAlert("Failure importing textbook data!");
			}
			
		}
	}
	
	

	public void exportTextbookTextData() {
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
				Util.failureAlert("Failure exporting textbook data!");
			}
			for (int i = 0; i < nElems; i++) {
				Textbook textbook = textbookArray[i];
					pw.println(textbook.toString());
			
			}
			pw.close();
		}
	}
	
	
	public void load() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("data/TextbookBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			textbookArray = (Textbook[]) ois.readObject();
			nElems = (int) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			Util.failureAlert("Trouble finding TextbookBag.dat");
		} catch (IOException e) {
			Util.failureAlert("Trouble loading TextbookBag.dat");
		} catch (ClassNotFoundException e) {
			Util.failureAlert("Class not found exception occurred!");
		}

	}

	public void save() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("data/TextbookBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(textbookArray);
			oos.writeObject(nElems);
			oos.close();
		} catch (FileNotFoundException e) {
			Util.failureAlert("Failure finding PersonBag.dat file!");
		} catch (IOException e) {
			Util.failureAlert("Failure saving PersonBag.dat file!");
		}

	}

	public void insert(Textbook textbook) {
		textbookArray[nElems++] = textbook;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(textbookArray[i]);
		}
		System.out.println();
	}

	public Textbook removeById(String isbn) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (textbookArray[i].getIsbn().equals(isbn)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Textbook temp = textbookArray[i];
			for (int j = i; j < nElems - 1; j++) {
				textbookArray[j] = textbookArray[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Textbook findById(String isbn) {
		for (int i = 0; i < nElems; i++) {
			if (textbookArray[i].getIsbn().equals(isbn)) {
				return textbookArray[i];
			}
		}
		return null;
	}

}
