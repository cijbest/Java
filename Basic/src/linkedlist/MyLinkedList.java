package linkedlist;

public class MyLinkedList {
	
	private ListNode head;
	int count; //������ �ִ� element���� ��
	
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
			while(temp.next != null){ //temp�� ���� �ִ� ��带 ����ϱ� ���� ���� �� 
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
		
		if(position == 0){ //position�� 0�̸� head�� �ٲ�
			newNode.next = head; //���� �߿�!!!
			head = newNode;
		}
		else{
			//���� �� ����� �� ����
			ListNode preNode = null; //��
			ListNode tempNode = head; //��
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
			System.out.println("������ �׸��� �����ϴ�.");
			return null;
		}
		
		if(position < 0 || position > count){
			System.out.println(" ������ ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + getSize() + "�Դϴ�.");
			return null;
		}
		
		ListNode preNode = null; //��
		ListNode tempNode = head; //��
		
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
			System.out.println("������ ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + getSize() + "�Դϴ�.");
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
			System.out.println("������ ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + getSize() + "�Դϴ�.");
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
			System.out.println("����� ������ �����ϴ�");
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