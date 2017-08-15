package inheritance;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class PartTimeWorker extends Employee { //상속
	
	int payPerhour;
	int workTime;
	
	public PartTimeWorker(int id, String name){ // 상위클래스의 클래스가 항상 먼저 만들어진다. 
		super(id, name); // 상위 클래스에서 생성자를 만드면 하위 클래스에서 사용을 할 수가 없다?
	}
	
	public double getSalary(){
		return payPerhour*workTime;
	}
	

}
