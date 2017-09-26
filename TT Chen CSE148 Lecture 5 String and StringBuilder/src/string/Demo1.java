package string;

public class Demo1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("hellO");
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1 == str3);
		
		// String objects are immutable
		str1 = null;
		str2 = null;
		str2 = "hellO";
		System.out.println(str2);
		str2 = "hi";
		System.out.println(str2 == str3);
	}

}
