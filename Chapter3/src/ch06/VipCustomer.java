package ch06;

public class VipCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VipCustomer() {
		super(0, "no-name");
		customerGrade = "VIP"; // �����߻� customer���� private
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public VipCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		
		customerGrade = "VIP"; // �����߻� customer���� private
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
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentId + "�Դϴ�.";
	}
	
}
