package linkedlist;

public class MyLinkedList {
	
	private ListNode head;
	int count; //가지고 있는 element들의 수
	
	public MyLinkedList(){
		head = null;
		count = 0;
	}
	
	public ListNode addElement(String data){
		ListNode newNode = new ListNode(data);
		if(head == null){
			head = newNode;
		}
		else{
			ListNode temp = head;
			while(temp.next != null){ //temp는 끝에 있는 노드를 대신하기 위해 쓰는 것 
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public ListNode insertElement(int position, String data){
		if(position < 0 || position > count){
			return null;
		}
		ListNode newNode = new ListNode(data);
		
		if(position == 0){ //position이 0이면 head가 바뀜
			newNode.next = head; //순서 중요!!!
			head = newNode;
		}
		else{
			//삽입 할 노드의 옆 노드들
			ListNode preNode = null; //앞
			ListNode tempNode = head; //뒤
			for(int i = 0; i < position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public ListNode removeElement(int position){
		if(isEmpty()){
			System.out.println("삭제할 항목이 없습니다.");
			return null;
		}
		
		if(position < 0 || position > count){
			System.out.println(" 삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
			return null;
		}
		
		ListNode preNode = null; //앞
		ListNode tempNode = head; //뒤
		
		if(position == 0){
			head = tempNode.next;
		}
		else{
			for(int i = 0; i < position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}
	
	public int getSize(){
		return count;
	}
	
	public boolean isEmpty(){
		if(count == 0){
			return true;
		}return false;
	}
	
	public String getElement(int position){
		if(position < 0 || position >= count){
			System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
			return null;
		}
		
		ListNode tempNode = head;
		
		if(position == 0){
			return head.getData();
		}
		else{
			for(int i = 0; i < position; i++){
				tempNode = tempNode.next;
			}
		}
		return tempNode.getData();
	}
	
	public ListNode getNode(int position){
		if(position < 0 || position >= count){
			System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
			return null;
		}
		
		ListNode tempNode = head;
		
		if(position == 0){
			return head;
		}
		else{
			for(int i = 0; i < position; i++){
				tempNode = tempNode.next;
			}
		}
		return tempNode;
	}
	
	public void printAll(){
		if(count == 0){
			System.out.println("출력할 내용이 없습니다");
			return;
		}
		
		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null){
				System.out.print("->");
			}
		}System.out.println();
	}
	
	public void reverseList(){
		if(head == null) return;
		
		ListNode preNode = null;
		ListNode currentNode = null;
		ListNode nextNode = head;
		
		while(nextNode != null){
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
			currentNode.next = preNode;
		}
		
		head = currentNode;
	}

}
