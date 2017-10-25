package p5DuckExample;

public interface Flyable {
	default void fly() {
		System.out.println("Fly...");
	}

}
