package ducks;

public class MallardDuck extends Duck implements Flyable, Swimable, Quackable {

	@Override
	public void display() {
		System.out.println("Displaying a mallard duck");
	}

	

}
