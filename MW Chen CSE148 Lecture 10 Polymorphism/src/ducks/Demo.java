package ducks;

public class Demo {

	public static void main(String[] args) {
		MallardDuck mallardDuck1 = new MallardDuck();
		mallardDuck1.display();
		mallardDuck1.quack();
		mallardDuck1.swim();
		mallardDuck1.fly();
		
		RedHeadDuck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.fly();
		
		RubberDuckie rubberDuckie = new RubberDuckie();
		rubberDuckie.display();
		rubberDuckie.quack();
		rubberDuckie.swim();
		
		DecoyDuck dd = new DecoyDuck();
		dd.display();
		dd.move();
		
	}

}
