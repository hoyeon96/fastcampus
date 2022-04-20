package ch09;

public class LocalVaraibleInter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3;		// 처음에는 var로 데이터 타입 지정을 하면서 string 타입으로 해서 int형 자료로는 안됨
		
		
	}

}
