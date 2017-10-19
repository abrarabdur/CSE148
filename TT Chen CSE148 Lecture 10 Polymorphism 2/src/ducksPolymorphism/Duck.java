package ducksPolymorphism;

public abstract class Duck {
	public void quack() {
		System.out.println("Quack, quack...");
	}

	public void fly() {
		System.out.println("Fly...");
	}

	public abstract void display();
}
