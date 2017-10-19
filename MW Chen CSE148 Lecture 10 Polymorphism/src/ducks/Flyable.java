package ducks;

public interface Flyable {
	public void fly();
	
	default void playble() {
		System.out.println("It's play time.");
	}

}
