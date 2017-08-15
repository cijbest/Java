package abstractex;

public class DisplayTest {

	public static void main(String[] args) {

		Display chDisplay = new CharDisplay('H');
		chDisplay.display();
		
		System.out.println();
		
		Display strDiplay = new StringDisplay("Hello, World");
		strDiplay.display();
		
		Display strHDiplay = new StringDisplay("æ»≥Á«œººø‰");
		strHDiplay.display();
		
	}
}
