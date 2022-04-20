package ch01;

public class VipCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VipCustomer() {
		super(0, "no-name");
		customerGrade = "VIP"; // 오류발생 customer에서 private
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VipCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP"; // 오류발생 customer에서 private
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	public int getAgentId() {
		return agentId;
	}
}
