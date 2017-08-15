package student;

public class Student { //class = ��ü���� û����
	
	private int studentID; // public : ���� ������(modifier)
	private String studentName; //private : ���� ��Ű�� �������� �� ��. ->�޼ҵ� �̿��ؼ� ������ ��
	private static int serialNum = 10000; //�ڡڡڡڡ�(�����ڰ� ����� �� ������ �й��� 1�� �����Ͽ� studentID�� �ο���. studentID�� �����ϰ� �Ǹ� �� ����� �й��� �ٲ�Ƿ� static������ �ϳ� �����Ͽ� ����)
	
	public static final int MAX = 100; //final : ����� ����� �ٲ��� �ʰ� ��
	public static final int MIN = 0;
	
	private int month; //private : ����
	public void setMonth(int mon){
		if(mon < 0 || mon > 12){
			System.out.println("error");
			return;
		}
	}
	
	
	
	public Student(){ // default ������, body, ��ü / �����ڰ� �ϳ��� ������ ����Ʈ �����ڸ� �ݵ�� ��� -> �׷��� ������, new Student() ������.
		serialNum++;//�ڡڡڡڡ�
		this.studentID = serialNum;//�ڡڡڡڡ�
	}
	public Student(int studentID){ //��ü�� �������� �� �����ؾ��ϴ� ���� ���
		this.studentID = studentID;
	}
	
	/*
	public void setStudentID(int studentID){
		int i = 10; // i = ���ú���(��������) -----> stack�� �׿��ٰ� ������ �ִ� ������ ������ ����, �Լ��� stack ���
		
		this.studentID = studentID; //�Ű������� �̸��� ��ü ������ �̸��� ���� �� �����ϱ� ���� this ���
	
	}
	*/
	
	int max = Student.MAX;
	
	public void setStudentName(String name){
		studentName = name;
	}
	
	public int getStudentID(){
		return studentID;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
}
