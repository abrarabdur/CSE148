package p4AnonymousClass;

public class Demo {

	public static void main(String[] args) {
		IntCalculator square = new IntCalculator(){

			@Override
			public int calculate(int number) {
				return number * number;
			}
			
		};
		
		System.out.println("Square is: " + square.calculate(5));
	}

}
