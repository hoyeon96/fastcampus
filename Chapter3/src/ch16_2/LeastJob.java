package ch16_2;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("할당된 통화 수가 가장 적은 상담원에게 먼저 배분합니다.");
	}

}
