package sampleCode2;

public class Dog extends Pet {
	private boolean isMale;
	
	public Dog(String name, int age, String breed, boolean isMale) {
		super(name, age, breed);
		this.isMale = isMale;
	}
	
	public void move() {
		System.out.println("The dog is running...");
	}

	public boolean isGender() {
		return isMale;
	}

	public void setGender(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return super.toString() + ", isMale=" + isMale + "]";
	}
	
	
}
