package polynomial;

public class PolyLinkedList {
	
	PolyNode head;
	int count;
	
	PolyLinkedList(){
		head = null;
		count = 0;
	}
	
	public PolyNode addElement(int degree, int coef){
		PolyNode newNode = new PolyNode(degree, coef);
		if(head == null){
			head = newNode;
		}
		else{
			PolyNode temp = head;
			while(temp.next != null){ //temp는 끝에 있는 노드를 대신하기 위해 쓰는 것 
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public PolyNode insertElement(int position, int degree, int coef){
		if(position < 0 || position > count){
			return null;
		}
		PolyNode newNode = new PolyNode(degree, coef);
		
		if(position == 0){ //position이 0이면 head가 바뀜
			newNode.next = head; //순서 중요!!!
			head = newNode;
		}
		else{
			//삽입 할 노드의 옆 노드들
			PolyNode preNode = null; //앞
			PolyNode tempNode = head; //뒤
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
	
	public PolyNode removeElement(int position){
		if(isEmpty()){
			System.out.println("삭제할 항목이 없습니다.");
			return null;
		}
		
		if(position < 0 || position > count){
			System.out.println(" 삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
			return null;
		}
		
		PolyNode preNode = null; //앞
		PolyNode tempNode = head; //뒤
		
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
	
	public PolyNode getNode(int position){
		if(position < 0 || position >= count){
			System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + getSize() + "입니다.");
			return null;
		}
		
		PolyNode tempNode = head;
		
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
		
		PolyNode temp = head;
		while(temp != null){
			System.out.print(temp.getCoef() + "X" + "(" + temp.getDegree() + ")");
			temp = temp.next;
			if(temp != null){
				System.out.print("+");
			}
		}System.out.println();
	}
	
	public int getSize(){
		return count;
	}
	
	public boolean isEmpty(){
		if(count == 0){
			return true;
		}return false;
	}
	
	public PolyLinkedList addPolynomial(PolyLinkedList aList, PolyLinkedList bList){
		PolyLinkedList resultList = new PolyLinkedList();
		
		PolyNode aTemp = aList.head;
		PolyNode bTemp = bList.head;
		
		while(aTemp != null && bTemp != null){ //차수 비교해서 더하기
			if(aTemp.getDegree() > bTemp.getDegree()){
				resultList.addElement(aTemp.getDegree(), aTemp.getCoef());
				aTemp = aTemp.next; //aList 원소에서 다음 걸로 이동
			}else if(aTemp.getDegree() < bTemp.getDegree()){
				resultList.addElement(bTemp.getDegree(), bTemp.getCoef());
				bTemp = bTemp.next; //bList 원소에서 다음 걸로 이동
			}else{
				resultList.addElement(aTemp.getDegree(), aTemp.getCoef() + bTemp.getCoef());
				aTemp = aTemp.next;
				bTemp = bTemp.next;
			}
		}
		
		if(aTemp != null){ //aTemp가 아직 남아있는 경우
			while(aTemp != null){
				resultList.addElement(aTemp.getDegree(), aTemp.getCoef());
				aTemp = aTemp.next;
			}
		}
		
		if(bTemp != null){ //bTemp가 아직 남아있는 경우
			while(bTemp != null){
				resultList.addElement(bTemp.getDegree(), bTemp.getCoef());
				bTemp = bTemp.next;
			}
		}
		return resultList;
	}
	
	
}
