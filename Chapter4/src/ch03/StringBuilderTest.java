package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder sb = new StringBuilder(java);
		sb.append(android);
		
		String test = sb.toString();
		System.out.println(test);
	}

}
