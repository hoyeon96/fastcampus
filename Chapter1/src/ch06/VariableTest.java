package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bNum = -128;
//		byte bNum = 128; // Type mismatch: cannot convert from int to byte
		
		System.out.println(bNum);
		
		
//		int num = 12345678900; // The literal 12345678900 of type int is out of range
		long lNum = 12345678900L;
		
		System.out.println(lNum);
		
	}

}
