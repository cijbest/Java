package queuelinkedlist;

import linkedlist.ListNode;
import linkedlist.MyLinkedList;

public class MyListQueue extends MyLinkedList implements Queue{
	
	private ListNode front;
	private ListNode rear;
	
	public MyListQueue(){
		
		front = null;
		rear = null;
	}

	@Override
	public void enQueue(String data) {
		
		ListNode newNode;
		
		if(isEmpty()){
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else{
			newNode = addElement(data);
			rear = newNode;
		}
	}

	@Override
	public String deQueue() {
		
		String data;
		if(isEmpty()){
			System.out.println("queue is empty");
			return null;
		}
		else{
			data = front.getData();
			front = front.next;
			if(front == null){
				rear = null;
			}
		}
		return data;
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("queue is empty");
			return null;
		}
		return front.getData();
	}

	@Override
	public void printAll() {

		if(isEmpty()){
			System.out.println("queue is empty");
			return;
		}
		
		ListNode temp = front;
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}System.out.println();
	}
}