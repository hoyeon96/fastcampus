package ch01;

public class VipCustomer extends Customer {
	
	private int agentId;
	double salesRatio;
	
	public VipCustomer() {
		super(0, "no-name");
		customerGrade = "VIP"; // �����߻� customer���� private
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public VipCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP"; // �����߻� customer���� private
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	public int getAgentId() {
		return agentId;
	}
}
