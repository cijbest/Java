package inheritance;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class PartTimeWorker extends Employee { //���
	
	int payPerhour;
	int workTime;
	
	public PartTimeWorker(int id, String name){ // ����Ŭ������ Ŭ������ �׻� ���� ���������. 
		super(id, name); // ���� Ŭ�������� �����ڸ� ����� ���� Ŭ�������� ����� �� ���� ����?
	}
	
	public double getSalary(){
		return payPerhour*workTime;
	}
	

}
