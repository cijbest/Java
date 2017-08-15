package arraylist;

class Dog{
	String name;
	
	Dog(String name){
		this.name = name;
	}

	@Override
	public String toString() { //toString�� �ٽ� ������ ����
		return name;
	}
	
}



public class ToStingTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("��Ʈ��");
		System.out.println(dog);
		
		String str = new String("������");
		System.out.println(str);
		
		int i = 10; //4byte ����
		Integer i2 = new Integer(100); //Integer�� ��ü
		System.out.println(i2);
		
		//Float
		//Double
		//Char
		//-> �̷� �͵��� wrapper class��� ��
		
		int i3 = i + i2; //autoboxing
		Integer i4 = i3 + i2;
		System.out.println(i2.toString());
		
		
		
		
	}

}