package person;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		Person james = new Person("James");
		Person tomas = new Person("Tomas", 50);
		
		person.age = 40;
		person.name = "james";
		person.isMarried = true; //person.marry = "yes";
		person.childNum = 3;
		
		System.out.println("���� : " + person.age);
		System.out.println("�̸� : " + person. name);
		System.out.println("��ȥ ���� : " + person.isMarried);
		System.out.println("�ڳ� �� : " + person.childNum);
	}

}
