package ch01;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
//		customerLee.setCustomerName("�̼���");
//		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VipCustomer customerKim = new VipCustomer(10020, "������");
//		customerKim.setCustomerName("������");
//		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;

		System.out.println(customerKim.showCustomerInfo());
	}

}
