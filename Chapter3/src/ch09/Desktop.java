package ch09;

public class Desktop extends Computer {

	@Override
	void display() {
		System.out.println("DeskTop display");
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing");		
	}
	
	@Override
	void turnOff() {
		System.out.println("DeskTop turnoff");
	}
}
