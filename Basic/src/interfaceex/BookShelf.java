package interfaceex;

public class BookShelf extends Shelf implements IStack{//책 보관하는 책장

	@Override
	public void push(String str) {
		add(str);
	}

	@Override
	public String pop() {
		return remove();
	} 

	
}
