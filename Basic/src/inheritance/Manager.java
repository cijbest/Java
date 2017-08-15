package inheritance;

public class Manager extends Employee {
	
	String department;
	double bonusRatio;
	
	public Manager(int id, String name, String department){
		super(id, name);
		this.department = department;
	}
	
	public void showInfo(){ //메소드 오버라이딩(재정의) -> 상위클래스에 있는 메소드 이름과 같음.
		super.showInfo(); //super : 상위클래스의 주소를 가리킴
		System.out.println(department);
	}
	
	public void test(){
		System.out.println(id);
	}
	
	public double getSalary(){
		return salary + (salary*bonusRatio);
	}

}
