package interfaceex;

public class BookShelf extends Shelf implements IStack{//å �����ϴ� å��

	@Override
	public void push(String str) {
		add(str);
	}

	@Override
	public String pop() {
		return remove();
	} 

	
}
