package ch19;

public class Car {
	
	public static int serialNumber = 10000;
	private int carNum;
	

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public Car() {
		serialNumber++;
		carNum = serialNumber;
	}
	
}
