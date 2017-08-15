package array;

class MyDog{
	String name;
	String type;
	
	public MyDog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public String getName(){
		return name;
	}
		
}

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		MyDog[] dogArr = new MyDog[5]; //�ּҸ� ����
		dogArr[0] = new MyDog("������1", "������");
		dogArr[1] = new MyDog("������2", "�ùٰ�");
		dogArr[2] = new MyDog("������3", "�㽺Ű");
		dogArr[3] = new MyDog("������4", "���۵�");
		dogArr[4] = new MyDog("������5", "��𿹵�");
		
		for(MyDog d : dogArr){
			System.out.println(d.getName());
		}
		
		

	}

}