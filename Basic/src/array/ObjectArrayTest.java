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
		
		MyDog[] dogArr = new MyDog[5]; //주소만 잡힘
		dogArr[0] = new MyDog("강아지1", "진돗개");
		dogArr[1] = new MyDog("강아지2", "시바견");
		dogArr[2] = new MyDog("강아지3", "허스키");
		dogArr[3] = new MyDog("강아지4", "셰퍼드");
		dogArr[4] = new MyDog("강아지5", "사모예드");
		
		for(MyDog d : dogArr){
			System.out.println(d.getName());
		}
		
		

	}

}
