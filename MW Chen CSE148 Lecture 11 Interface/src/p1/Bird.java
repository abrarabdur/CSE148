package p1;

public class Bird implements Flyable, Swimable{

	@Override
	public void fly() {
		System.out.println("fly...");
	}

	@Override
	public void swim() {
		System.out.println("swim...");
	}

}
