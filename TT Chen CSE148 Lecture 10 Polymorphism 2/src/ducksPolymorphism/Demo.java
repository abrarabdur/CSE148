package ducksPolymorphism;

public class Demo {

	public static void main(String[] args) {
		Duck m1 = new MallardDuck();
		m1.quack();
		m1.fly();
		m1.display();
		
		Duck r1 = new RedHeadDuck();
		r1.quack();
		r1.fly();
		r1.display();
	}

}
