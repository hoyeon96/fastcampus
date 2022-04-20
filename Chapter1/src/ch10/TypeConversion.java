package ch10;

public class TypeConversion {

	public static void main(String[] args) {

		double dNum = 2.5;
		float fNum = 0.99F;
		
		int iNum1 = (int)dNum + (int)fNum;  // 2 + 0
		int iNum2 = (int)(dNum + fNum); // (int)3.49 => 3
		
		System.out.println(iNum1);	// 2
		System.out.println(iNum2);  // 3
	}

}
