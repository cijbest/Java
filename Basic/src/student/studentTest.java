package student;

public class studentTest {

	public static void main(String[] args) {
		
		System.out.println(StaticTest.getSNum());//�� �� ���� -> 0�� ���� => static���� �ٲٸ� ��

		int num;
		num = 10;
		
		//������ �׽�Ʈ
		//Student studentChoi = new Student(20145334);

		
		//�ν��Ͻ� 1 (�ν��Ͻ� ��ü : studentSong)
		//new ----> heap ������ ������!!!!!!!!!!
		Student studentSong = new Student(); //studentSong : ��������
		//studentSong.studentID = 12345;
		//studentSong.studentName = "���߱�";
		//studentSong.setStudentID(1234);
		studentSong.setStudentName("���߱�");
		
		//System.out.println(studentSong.studentID);
		//System.out.println(studentSong.studentName);
		System.out.println(studentSong.getStudentID()); //10001
		System.out.println(studentSong.getStudentName()); //���߱�
		
		//�ν��Ͻ� 2
		Student studentLee = new Student();
		//studentLee.studentID = 56789;
		//studentLee.studentName = "�̽±�";
		//studentLee.setStudentID(56789);
		studentLee.setStudentName("�̽±�");
		
		//System.out.println(studentLee.studentID);
		//System.out.println(studentLee.studentName);
		System.out.println(studentLee.getStudentID()); //10002
		System.out.println(studentLee.getStudentName()); //�̽±�
		
		System.out.println(studentSong.getStudentID()); //10001
		
		System.out.println(studentSong);//jvm�� �� ���� �ּ�(heap ������ �����Ͱ� �����)
		System.out.println(studentLee); //���� ����
		
		
	}

}
