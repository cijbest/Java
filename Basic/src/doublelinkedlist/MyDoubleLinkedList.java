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
			while(tempNode.next != null){ //temp는 끝에 있는 노드를 대신하기 위해 쓰는 것 
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
			System.out.println(" 삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
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
		System.out.println(position + "번째 항목 " + tempNode.getData() + "가 삭제되었습니다.");
		return tempNode;
	}
	
	public int getSize(){
		return count;
	}
	/*
	public DListNode getNode(int position){ //temp를 돌리면 된다??
		
	}
	*/
	public void removeAll(){
		head = null;
		count = 0;
	}
	
	
	public void printAll(){
		if(isEmpty()){
			System.out.println("출력할 내용이 없습니다");
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
