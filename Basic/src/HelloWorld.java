import student.Student; //student ��ü(class)�� ������ ������ �� �� / ��Ű���̸�.Ŭ����(��ü)�̸�

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello, World");
		
		int num = 10;
		//float fNum = 10; //�ڵ� ����ȯ(10.0)
		float fNum = 10.2f; //float�� ������ �� ���� f�� �ٿ��־�� ��
		double dNum = 0.1; //�ڹٴ� �Ǽ��� ���� �� double�� �ν�, �Ϲ������� double ���
		long iNum = 10000000000L; //������ ��κ� int�� �ν�, long�� ������ �� �� L �ٿ���, L �� �ٿ��ְ� ���� Ű��� int �������� ����Ƿ� ������ ��
		num = (int)fNum; //���� ĳ����(������x)
		  //int, float, double... : ������ �ִ� ������ Ÿ�� (primitive data type)
		
		String str; //String : ��ü = Ŭ���� (��ü Ÿ��), jdk ���� ������ �ִ� ���̺귯�� -> str : Ŭ������ ����� ����
		
		
		System.out.println(num);
		System.out.println(fNum);
		
		
		
		
		Student s = new Student(); 
		//s.studentID = 123; //public �� �ٿ� ���(default���� => ���� ��Ű�� �������� ���� ����) ������ ��
	}

}
