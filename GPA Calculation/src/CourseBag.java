import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;
	
	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
	}
	
	public Course[] getCourseArray() {
		return Arrays.copyOf(courseArray, nElems);
	}
	
	public void insert(Course course) {
		courseArray[nElems++] = course;
	}
	
	public void importData() {
		File file = new File("input/courses.txt");
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String[] tokens = in.nextLine().split(", ");
				Course course = new Course(tokens[0], tokens[1], Integer.valueOf(tokens[2]));
				insert(course);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
