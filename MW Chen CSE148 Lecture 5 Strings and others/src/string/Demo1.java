package string;

public class Demo1 {
// immutable classes
	// interned objects 
	// compare object contents, .equals
	// compare ref. variable contents, ==
	public static void main(String[] args) {
////		String str1 = "Hello";
//		String str2 = "Hello";
//		System.out.println(str1==str2);// comparing the contents of two ref. variables
//		System.out.println(str1.equals(str2));// comparing the contents of two objects
		String str3 = new String("Hello");
//		System.out.println(str1==str3);
//		System.out.println(str1.equals(str3));
		// immutable
//		String str4 = "Hello";
//		System.out.println(str3==str4);
//		str1 = null;
//		str2 = null;
//		str4 = null;
		String str1 = "Hello"; //created a new object
		str1 = "hi"; // object pointed by previous str1 is garbage collected, new one is born.
		
	}

}
