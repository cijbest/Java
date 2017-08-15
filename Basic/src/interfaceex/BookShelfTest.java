package interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {

		IStack stackShelf = new BookShelf();
		stackShelf.push("´ë¹é»ê¸Æ1");
		stackShelf.push("´ë¹é»ê¸Æ2");
		stackShelf.push("´ë¹é»ê¸Æ3");
		
		System.out.println(stackShelf.pop());
		System.out.println(stackShelf.pop());
		System.out.println(stackShelf.pop());
	}

}
