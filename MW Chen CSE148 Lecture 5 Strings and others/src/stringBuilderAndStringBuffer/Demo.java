package stringBuilderAndStringBuffer;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Hi");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("dfsa afds sa");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("hi");
		System.out.println(sb2);
		System.out.println(sb2.insert(0, "Hello "));
		
		StringBuffer sBuffer = new StringBuffer();
	}

}
