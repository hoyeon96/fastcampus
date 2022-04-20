package ch01;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VipCustomer customerKim = new VipCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;

		System.out.println(customerKim.showCustomerInfo());
	}

}
