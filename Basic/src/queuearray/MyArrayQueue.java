package queuearray;

public class MyArrayQueue implements IQueue{

	private int front;
	private int rear;
	private int QUEUE_SIZE;
	char[] itemArr;
	
	public MyArrayQueue(int size){
		front = -1;
		rear = -1;
		QUEUE_SIZE = size;
		itemArr = new char[QUEUE_SIZE];
	}
	
	@Override
	public void enQueue(char ch) {
		
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		
		itemArr[++rear] = ch;
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return (char)-1;
		}
		return itemArr[++front];
		
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return (char)-1;
		}
		return itemArr[front+1];
	}

	@Override
	public void printAll() {
		
		if(isEmpty()){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		for(int i = front+1 ; i<=rear; i++){
			System.out.println(itemArr[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isEmpty(){
		return (front == rear);

	}

	public boolean isFull(){
	  return (rear == QUEUE_SIZE -1);
	}
	

}
