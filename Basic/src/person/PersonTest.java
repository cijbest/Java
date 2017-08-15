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
		
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person. name);
		System.out.println("결혼 여부 : " + person.isMarried);
		System.out.println("자녀 수 : " + person.childNum);
	}

}
