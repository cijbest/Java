package linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.addElement("D");
		list.addElement("E");
		
		list.printAll();
		
		list.insertElement(2, "Z");
		list.printAll();
		
		list.insertElement(0, "F");
		list.printAll();
		
		list.removeElement(3);
		list.printAll();
		
		list.reverseList();
		list.printAll();
		
	}

}
