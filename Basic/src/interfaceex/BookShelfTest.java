package interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {

		IStack stackShelf = new BookShelf();
		stackShelf.push("�����1");
		stackShelf.push("�����2");
		stackShelf.push("�����3");
		
		System.out.println(stackShelf.pop());
		System.out.println(stackShelf.pop());
		System.out.println(stackShelf.pop());
	}

}
