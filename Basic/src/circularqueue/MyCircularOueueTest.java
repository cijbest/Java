package circularqueue;

public class MyCircularOueueTest {

	public static void main(String[] args) {

		MyCircularQueue queue = new MyCircularQueue(10);

		queue.enQueue('A');
		queue.enQueue('B');
		queue.enQueue('C');

		queue.printAll();
		System.out.println(queue.deQueue());
//		queue.enQueue('C');
		queue.printAll();
	}

}
