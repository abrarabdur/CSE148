package sampleCode2;
/*
 * A subclass gets everything that is not private from the superclass.
 * final keyword for the class-- the class cannot be extended
 */
public class Cat extends Pet {
	private String color;
	private double age;
	
	public Cat(String name, int age, String breed, String color) {
		super(name, age, breed);
		this.color = color;
	}
	
	// overridden method
	public void move() {
		System.out.println("The cat is jumping...");
	}
	
	//Overridden method
	public void setAge(double age) {
		this.age = age;
	}

	//Overridden method
	public int getAge() {
		return (int)age;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color=" + color;
	}
	
	
}
