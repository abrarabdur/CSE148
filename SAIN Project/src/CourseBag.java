import java.util.Arrays;

public class CourseBag {
	private static Course[] courseArray;
	private static int nElems;

	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}

	public void insert(Course course) {
		courseArray[nElems++] = course;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
		System.out.println();
	}

	public static Course[] getCourseArray() {
		return Arrays.copyOf(courseArray, nElems);
	}

}
