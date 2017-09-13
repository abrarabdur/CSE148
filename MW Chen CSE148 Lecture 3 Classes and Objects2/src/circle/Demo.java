package circle;

public class Demo {

	public static void main(String[] args) {
		int i = 1;
		double d = 1.5;
		
		String name = "Joe";
		
		Circle c1 = new Circle(); // default constructor, also no-arg cont.
//		Circle c2 = c1;
//		c1 = null;
//		c2 = null;
		System.out.println(c1.getNumberOfCircles());
		c1.setRadius(1);
		System.out.println(c1);
		System.out.println("-------------------");
		Circle c2 = new Circle();
		System.out.println(c2.getNumberOfCircles());
		c2.setRadius(2);
		System.out.println(c2
				);
		System.out.println("-------------------");
		Circle c3 = new Circle(10);
		System.out.println(c3.getNumberOfCircles());
		System.out.println(c1.getNumberOfCircles());
		System.out.println(c2.getNumberOfCircles());
		System.out.println(c3.toString());
		System.out.println("-------------------");
		
	}

}
