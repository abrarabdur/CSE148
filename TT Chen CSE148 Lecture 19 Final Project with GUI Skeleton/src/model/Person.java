package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Person {
	private String name;
	private String id;
	private String phone;

	private static int idCounter = 0;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void saveIdCounter() {
		try {
			PrintWriter pw = new PrintWriter("data/idCounter.txt");
			pw.write(idCounter);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void loadIdCounter() {
		File file = new File("data/idCounter.txt");
		try {
			Scanner scanner = new Scanner(file);
			idCounter = scanner.nextInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phone=" + phone + "]";
	}
	
	

}
