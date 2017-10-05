package p1_rectangle;

public class Demo {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 5);
		System.out.println(r1.getArea());
		Cube c1 = new Cube(10, 5, 1);
		System.out.println(c1.getVolume());
		System.out.println(c1.getSurfaceArea());
	}

}
