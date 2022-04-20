package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
		
		
		double[] dArr = new double[5];
		double mtotal = 1;
		
		dArr[0] = 1.1;  
		dArr[1] = 2.1; 
		dArr[2] = 3.1; 
				
		for(int i = 0; i< dArr.length; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
		
		double[] dArr2 = new double[5];
		int count = 0;
		dArr2[0] = 1.1; count++; 
		dArr2[1] = 2.1; count++;
		dArr2[2] = 3.1; count++;
				
		double mtotal2 = 1;
		for(int i = 0; i< count; i++) {
			mtotal2 *= dArr2[i];
		}
				
		System.out.println(mtotal2);

		

	}
}
