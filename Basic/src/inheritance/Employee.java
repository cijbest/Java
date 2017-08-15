package inheritance;

public class Employee{ //extends Object : java의 모든 최상위 클래스는 Object / 다 Object이다.
	
	//protected : 같은 패키지 내에서만/상속 관계에서만 사용 가능. 단, 외부클래스에선 못 씀.
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(int id, String name){ //다른 클래스들에 에러가 나는 이유 : 
		this.id = id;
		this.name = name;
	}
	
	public void showInfo(){
		System.out.println(id + ", " + name);
	}
	
	public double getSalary(){
		return salary;
	}
	
	

}
