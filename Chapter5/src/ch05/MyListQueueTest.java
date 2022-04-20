package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		
		MyLinkededQueue listQueue = new MyLinkededQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		
		listQueue.printAll();
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
	}

}
