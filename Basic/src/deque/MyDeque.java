package deque;

import doublelinkedlist.DListNode;
import doublelinkedlist.MyDoubleLinkedList;
import linkedlist.ListNode;

public class MyDeque extends MyDoubleLinkedList{
	
	private DListNode front;
	private DListNode rear;
	
	public void insertFront(){
		
		
	}
	
	public void insertFront(String data){
		
		DListNode newNode;
		if(isEmpty()){
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else{
			newNode = insertElement(0, data);
			front.prev = newNode;
			newNode.next = front;
			front = newNode;			
		}
	}
	
	public void insertRear(String data){
		
		DListNode newNode;
		if(isEmpty()){
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else{
			newNode = addElement(data);
			rear.next = newNode;
			newNode.prev = rear;
			rear = newNode;			
		}
	}
	
	public String deleteFront(){
		
		if(isEmpty()){
			return null;
		}
		else{
			String data = front.getData();
			front = front.next;
			if(front == null){
				rear = null;
			}
			removeElement(0);
			return data;
		}
	}
	
	public String deleteRear(){
		
		if(isEmpty()){
			return null;
		}
		else{
			String data = rear.getData();
			rear = rear.prev;
			if(rear == null){
				front = null;
			}
			removeElement(getSize()-1);
			return data;
		}
		
	}
	
	public void printAll(){
		
		if(isEmpty()){
			System.out.println("queue is empty");
			return;
		}
		
		DListNode temp = front;
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}System.out.println();
	}

	
}
