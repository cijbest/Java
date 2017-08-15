package inheritance;

public class Manager extends Employee {
	
	String department;
	double bonusRatio;
	
	public Manager(int id, String name, String department){
		super(id, name);
		this.department = department;
	}
	
	public void showInfo(){ //�޼ҵ� �������̵�(������) -> ����Ŭ������ �ִ� �޼ҵ� �̸��� ����.
		super.showInfo(); //super : ����Ŭ������ �ּҸ� ����Ŵ
		System.out.println(department);
	}
	
	public void test(){
		System.out.println(id);
	}
	
	public double getSalary(){
		return salary + (salary*bonusRatio);
	}

}
