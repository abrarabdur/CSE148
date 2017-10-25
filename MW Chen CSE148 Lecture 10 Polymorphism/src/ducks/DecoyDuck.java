package ducks;

public class DecoyDuck extends Duck implements Moveable{

	@Override
	public void display() {
		System.out.println("Showing a Decoy Duck...");
	}

}
