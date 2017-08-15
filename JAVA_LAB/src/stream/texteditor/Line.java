package stream.texteditor;

public class Line extends Editor {

	public Line(TextEditor texteditor) {
		super(texteditor);
	}
	
	public void edit(){
		super.edit();
		System.out.print(" with Line");
	}
	

}
