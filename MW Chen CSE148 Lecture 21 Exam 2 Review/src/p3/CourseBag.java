package p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import p1.Grade;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	public void insert(Course course) {
		courseArray[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
		System.out.println();
	}
	
	public void importData() {
		 File file = new File("courses.txt");
		 try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String[] tokens = in.nextLine().split(", ");
				Course course = new Course(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
				insert(course);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	 }

}
