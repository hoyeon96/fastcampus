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
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
}
