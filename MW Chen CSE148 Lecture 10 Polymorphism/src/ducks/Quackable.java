package ducks;

public interface Quackable {

	default void quack() {
		System.out.println("Quack...");
	}
}
