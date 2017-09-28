package stringBuilder;

public class Demo1 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Adam");
		StringBuilder sb2 = sb1;
		sb1.append("Billy");
		System.out.println(sb1 == sb2);
		
		sb1.delete(0, 2);
		sb1.insert(2, "HHHHH");
		System.out.println(sb1.toString());
		System.out.println(sb1.reverse().toString());
		
		StringBuilder sb3 = new StringBuilder("Hello");
		
	}

}
