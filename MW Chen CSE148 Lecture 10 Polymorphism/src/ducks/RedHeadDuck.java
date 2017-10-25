package ducks;

public class RedHeadDuck extends Duck implements Flyable, Swimable, Quackable{

	@Override
	public void display() {
		System.out.println("Displaying a redhead duck");

	}

}
