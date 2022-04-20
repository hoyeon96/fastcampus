package ch15;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		x xClass = mClass;
		xClass.x();
		
		
		y yClass = mClass;
		yClass.y();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
