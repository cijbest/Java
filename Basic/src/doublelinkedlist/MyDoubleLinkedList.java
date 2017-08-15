package doublelinkedlist;

import linkedlist.ListNode;

public class MyDoubleLinkedList {
	
	private DListNode head;
	int count;
	
	public MyDoubleLinkedList(){
		head = null;
		count = 0;
	}
	
	public DListNode addElement(String data){
		DListNode newNode = new DListNode(data);
		if(head == null){
			head = newNode;
		}
		else{
			DListNode tempNode = head;
			while(tempNode.next != null){ //temp�� ���� �ִ� ��带 ����ϱ� ���� ���� �� 
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			tempNode.prev = tempNode;
		}
		count++;
		return newNode;
	}
	
	public DListNode insertElement(int position, String data){
		if(position < 0 || position > count){
			return null;
		}
		
		DListNode newNode = new DListNode(data);
		DListNode tempNode = head;
		
		if(position == 0){
			newNode.next = tempNode;
			tempNode.prev = newNode;
			head = newNode;
		}
		else{
			DListNode preNode = null;
			for(int i = 0; i< position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.prev = preNode;
			newNode.next = preNode.next;
			preNode.next = newNode;
			if(tempNode != null){
				tempNode.prev = newNode;
			}
		}
		count++;
		return newNode;
	}
	
	public boolean isEmpty(){
		if(count == 0) return true;
		else return false;
	}
	
	public DListNode removeElement(int position){
		
		if(position < 0 || position > count){
			System.out.println(" ������ ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + getSize() + "�Դϴ�.");
			return null;
		}
		
		DListNode tempNode = head;
		
		if(position == 0){
			head.next.prev = null;
			head = head.next;
		}
		else{
			DListNode preNode = null;
			for(int i = 0; i < position ; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
			if(tempNode.next != null){
				tempNode.next.prev = preNode;
			}
		}
		count--;
		System.out.println(position + "��° �׸� " + tempNode.getData() + "�� �����Ǿ����ϴ�.");
		return tempNode;
	}
	
	public int getSize(){
		return count;
	}
	/*
	public DListNode getNode(int position){ //temp�� ������ �ȴ�??
		
	}
	*/
	public void removeAll(){
		head = null;
		count = 0;
	}
	
	
	public void printAll(){
		if(isEmpty()){
			System.out.println("����� ������ �����ϴ�");
			return;
		}
		
		DListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null){
				System.out.print("<->");
			}
		}System.out.println();
	}

}
