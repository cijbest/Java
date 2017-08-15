package circularqueue;

import queuearray.IQueue;

public class MyCircularQueue implements IQueue {
	
	private int front;
	private int rear;
	private int QUEUE_SIZE;
	char[] itemArr;
	
	public MyCircularQueue(int size){
		itemArr = new char[size];
		front = -1;
		rear = -1;
	}

	@Override
	public void enQueue(char ch) {
		if(isFull()){
			System.out.println("queue is full");
			return;
		}
		rear = (rear + 1) % QUEUE_SIZE;
		itemArr[rear] = ch;
	}
	
	public boolean isEmpty(){
		return (front == rear);
	}
	
	public boolean isFull(){
		return ((rear + 1) % QUEUE_SIZE == front);
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			System.out.println("queue is emtpy");
			return (char)-1;
		}
		front = (front+1) % QUEUE_SIZE;
		return itemArr[front];
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("queue is empty");
			return (char)-1;
		}
		
		return itemArr[(front+1) % QUEUE_SIZE];
	}

	@Override
	public void printAll() {
		
		if(isEmpty()){
			System.out.println("queue is empty");
			return;
		}
		
		for(int i = (front + 1) % QUEUE_SIZE ; i != (rear+1) % QUEUE_SIZE; i=(++i%QUEUE_SIZE)){
	
			System.out.println(itemArr[i] + " ");
		}
		System.out.println();
		
	}

}
