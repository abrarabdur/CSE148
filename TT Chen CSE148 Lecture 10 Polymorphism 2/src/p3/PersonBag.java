package p3;

public class PersonBag {
	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public Student findStudentWithHighestGPA() {
		double highestGPA = 0.0;
		int highestGPAIndex = -1;
		
		// cycle through the bag
		for(int i = 0; i < nElems; i++) {
			if(personArray[i] instanceof Student) {
				if(highestGPA < ((Student)personArray[i]).getGpa()) {
					highestGPA = ((Student)personArray[i]).getGpa();
					highestGPAIndex = i;
				}
			}
		}
		if(highestGPAIndex == -1) {
			System.out.println("No one has a gpa higher than 0.0");
			return null;
		}
		return (Student)personArray[highestGPAIndex];// casting to student
		
	}
 	
	public void insert(Person person) {
		personArray[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}
}
