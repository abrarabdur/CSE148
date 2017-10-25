package p3DefaultInterface;

public class Demo2 {

	public static void main(String[] args) {
		IntCalculator c1 = new IntCalculator() {
			
		};
		
		System.out.println(c1.add(1, 2));
		System.out.println(c1.subtract(2, 3));
	}

}
