package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		Manager m = new Manager(12345, "James", "Sale");
		m.id = 12345; //����Ŭ�������� ������ �� ���� ���� -> private�̶�
		m.name = "James"; //������ protected�� �� ���� ���� ��Ű�� ���� �ֱ� ������ ��� ����
		m.department = "Sales";
		
		m.showInfo();
		
		Employee e = new Employee(100, "Tomas");
		e.id = 100;
		e.name = "Tomas";
		
		e.showInfo();
		
		Employee me = new Manager(9876, "Edward", "Sales"); //employee ������ �� �� ���� -> �׷��� ������ ����
		me.id = 9876;
		me.name = "Edward";
		
		me.showInfo(); //�޼ҵ�� manager���� �����(virtual:���� �Լ�)
		*/
		
		
		Employee e = new Employee(100, "James");
		e.salary = 3000000;
		
		Manager m = new Manager(200, "Tomas", "Sales");
		m.salary = 5000000;
		m.bonusRatio = 0.1;
		
		PartTimeWorker pw = new PartTimeWorker(300, "kim");
		pw.payPerhour = 7600;
		pw.workTime = 100;
		
		Employee[] eList = new Employee[3];
		eList[0] = e;
		eList[1] = m;
		eList[2] = pw;
		
		for(Employee em : eList){
			System.out.println(em.name + "���� �̹� �� �޿��� " + em.getSalary() + "�Դϴ�.");
		} // getSalary�� �������� ���°� ��. manager�� parttime�� �����ؼ� �׿� ���� salary���� �޸� �߱� ����.
			
		if(eList[1] instanceof Manager){ //���� Ŭ�������� ����Ŭ������ �ٿ� ĳ���� �ϰ��� �� ��
			Manager m2 = (Manager)eList[1]; //eList[1]�� ����Ŭ������ manager�� ���
		}
		else if(eList[1] instanceof PartTimeWorker){
			PartTimeWorker m2 = (PartTimeWorker)eList[1];
		}
		
		
		
		/*
		Employee e = new Employee();
		PartTimeWorker pw = new PartTimeWorker();
		
		Employee pe = new PartTimeWorker(); //PartTimeWorker�� Employee Ÿ���̴�.
		
		//��� Ÿ���� Object�� �� �� �ִ�.
		Object op = new PartTimeWorker(); //Object Ÿ�� �ۿ� �� ��
		Object oe = new EmployeeTest();
		
		Employee e2 = (Employee)oe; // Employee �� �������� ���� ������ ������ ĳ���� �ؾ� ��
		*/
		
		

	}

}