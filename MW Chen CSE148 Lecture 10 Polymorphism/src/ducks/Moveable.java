package ducks;

public interface Moveable {
	default void move() {
		System.out.println("The duck can be moved around...");
	}

}
