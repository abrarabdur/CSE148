package p2AnonymousClass;

public class Demo {

	public static void main(String[] args) {
		IntCalculator c1 = new IntCalculator() {

			@Override
			public int calculate(int number) {
				return number * number;
			}
			
		};
		
		System.out.println(c1.calculate(5));
	}

}
