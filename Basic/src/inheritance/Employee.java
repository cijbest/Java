package inheritance;

public class Employee{ //extends Object : java�� ��� �ֻ��� Ŭ������ Object / �� Object�̴�.
	
	//protected : ���� ��Ű�� ��������/��� ���迡���� ��� ����. ��, �ܺ�Ŭ�������� �� ��.
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee(int id, String name){ //�ٸ� Ŭ�����鿡 ������ ���� ���� : 
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
