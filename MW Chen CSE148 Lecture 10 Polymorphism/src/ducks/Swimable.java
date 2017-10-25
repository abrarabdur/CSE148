package ducks;

public interface Swimable {
	default void swim() {
		System.out.println("Swim...");
	}
}
