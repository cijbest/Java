package doublelinkedlist;

public class MyDoubleLinkedListTest {

	public static void main(String[] args) {

		MyDoubleLinkedList list = new MyDoubleLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		
		list.printAll();
		
		list.insertElement(0, "D");
		list.printAll();
		list.insertElement(1, "A+");
		list.insertElement(5, "B+");
		list.printAll();
		
		list.removeElement(0);
		list.printAll();
		list.removeElement(4);
		list.printAll();
		
	}

}