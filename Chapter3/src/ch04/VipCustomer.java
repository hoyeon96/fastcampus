package ch04;

public class VipCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VipCustomer() {
		super(0, "no-name");
		customerGrade = "VIP"; // 오류발생 customer에서 private
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public VipCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP"; // 오류발생 customer에서 private
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		
		return price;
	}
	
	
}
