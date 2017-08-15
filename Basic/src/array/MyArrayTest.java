package array;

public class MyArrayTest {

	public static void main(String[] args) {

		MyArray arr = new MyArray(10);
		
		/*
		for(int i = 0; i < 4; i++){
			arr.addElement(i);
		}
		*/
		arr.addElement(1);
		arr.addElement(2);
		arr.addElement(3);
		arr.addElement(4);
		
		arr.intsertElement(1, 5);
		arr.intsertElement(9, 10);
		arr.printAll();
	}

}
