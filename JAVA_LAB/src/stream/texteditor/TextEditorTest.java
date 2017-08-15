package stream.texteditor;

public class TextEditorTest {

	public static void main(String[] args) {

		TextEditor myeditor = new MyEditor();
		myeditor.edit();
		System.out.println();
		
		TextEditor editorline = new Line(new MyEditor());
		editorline.edit();
		System.out.println();
		
		TextEditor editorscrolling = new Scrolling(new Line(new MyEditor()));
		editorscrolling.edit();
		System.out.println();
		
		TextEditor editorborder = new Border(new Scrolling(new Line(new MyEditor())));
		editorborder.edit();
	}

}
