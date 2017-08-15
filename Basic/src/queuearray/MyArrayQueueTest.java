package queuearray;

public class MyArrayQueueTest {
	
	public static void main(String[] agrs){
		
		IQueue queue = new MyArrayQueue(10);

		queue.enQueue('A');
		queue.enQueue('B');
		queue.enQueue('C');

		queue.printAll();
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		queue.deQueue();

	}

}
