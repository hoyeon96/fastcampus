package ch19;

public class CarFactory {
	
	public static CarFactory instance = new CarFactory();

	public CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if( instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
