package student;

public class studentTest {

	public static void main(String[] args) {
		
		System.out.println(StaticTest.getSNum());//쓸 수 없음 -> 0값 나옴 => static으로 바꾸면 됨

		int num;
		num = 10;
		
		//생성자 테스트
		//Student studentChoi = new Student(20145334);

		
		//인스턴스 1 (인스턴스 객체 : studentSong)
		//new ----> heap 영역에 생성됨!!!!!!!!!!
		Student studentSong = new Student(); //studentSong : 참조변수
		//studentSong.studentID = 12345;
		//studentSong.studentName = "송중기";
		//studentSong.setStudentID(1234);
		studentSong.setStudentName("송중기");
		
		//System.out.println(studentSong.studentID);
		//System.out.println(studentSong.studentName);
		System.out.println(studentSong.getStudentID()); //10001
		System.out.println(studentSong.getStudentName()); //송중기
		
		//인스턴스 2
		Student studentLee = new Student();
		//studentLee.studentID = 56789;
		//studentLee.studentName = "이승기";
		//studentLee.setStudentID(56789);
		studentLee.setStudentName("이승기");
		
		//System.out.println(studentLee.studentID);
		//System.out.println(studentLee.studentName);
		System.out.println(studentLee.getStudentID()); //10002
		System.out.println(studentLee.getStudentName()); //이승기
		
		System.out.println(studentSong.getStudentID()); //10001
		
		System.out.println(studentSong);//jvm이 준 가상 주소(heap 영역에 데이터가 저장됨)
		System.out.println(studentLee); //이하 생략
		
		
	}

}
