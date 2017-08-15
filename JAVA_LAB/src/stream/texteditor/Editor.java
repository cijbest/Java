package stream.texteditor;

public abstract class Editor extends TextEditor{

	TextEditor texteditor;
	
	public Editor(TextEditor texteditor){
		this.texteditor = texteditor;
	}
	
	public void edit(){
		texteditor.edit();
	}
}
