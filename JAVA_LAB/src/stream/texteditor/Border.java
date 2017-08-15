package stream.texteditor;

public class Border extends Editor {

	public Border(TextEditor texteditor) {
		super(texteditor);
	}
	
	public void edit(){
		super.edit();
		System.out.print(" with Border");
	}
}
