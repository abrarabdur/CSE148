package regExpValidatePhone;

public class Demo {

	public static void main(String[] args) {
		String s1 = "1234567890";
		String s2 = "(631)123-4567";
		String s3 = "123-456-7890";
		String s4 = "123.456.7890";
		String s5 = "(631)123.4567";
		
		boolean b = s5.matches("[(]?(\\d{3})[)]?[-.]?(\\d{3})[.-]?(\\d{4})");
		String phoneNumber = s5.replaceAll("[(]?(\\d{3})[)]?[-.]?(\\d{3})[.-]?(\\d{4})", "($1)$2-$3");
		System.out.println(phoneNumber);
//		System.out.println(b);
//		
//		StringBuilder sb = new StringBuilder(s1);
//		sb = sb.insert(0, "(");
//		sb = sb.insert(4, ")");
//		sb = sb.insert(8, "-");
//		System.out.println(sb.toString());
	}

}