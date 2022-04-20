package ch12;

public class ShortCircuit {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println(value); // (20 < 10)&&(4 < 10) FALSE
//		System.out.println(num1);
//		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value); // (20 < 10) || (4 < 10) TRUE
//		System.out.println(num1);
//		System.out.println(i);
		
	}
}
