package interfaceex;

public class Shelf {

	String[] books;
	int count;
	
	public Shelf(){
		books = new String[10];
		count = 0;
	}
	
	public void add(String title){
		books[count++] = title;
	}
	
	public String remove(){
		String title = books[count-1];
		count--;
		
		return title;
	}
}
