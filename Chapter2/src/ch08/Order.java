package ch08;

public class Order {
	private String orderNumber;
	private String phoneNumber;
	private String address;
	private String orderDate;
	private String orderTime;
	private int price;
	private String menuNumber;
	
	public Order() {
		
	}
	
	public Order(String orderNumber, String phoneNumber, String address, 
			String orderDate, String orderTime, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void OrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
}
