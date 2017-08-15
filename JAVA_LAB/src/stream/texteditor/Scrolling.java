package stream.texteditor;

public class Scrolling extends Editor {
	
	public Scrolling(TextEditor texteditor) {
		super(texteditor);
	}
	
	public void edit(){
		super.edit();
		System.out.print(" with Scrolling");
	}

}
