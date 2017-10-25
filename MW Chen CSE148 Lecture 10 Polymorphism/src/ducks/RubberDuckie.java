package ducks;

public class RubberDuckie extends Duck implements Quackable, Swimable {

	@Override
	public void display() {
		System.out.println("Displaying a rubber duckie");
	}

	@Override
	public void quack() {
		System.out.println("Squeak...");
	}
}
