import student.Student; //student 객체(class)를 가져다 쓰려고 할 때 / 패키지이름.클래스(객체)이름

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello, World");
		
		int num = 10;
		//float fNum = 10; //자동 형변환(10.0)
		float fNum = 10.2f; //float를 쓰고자 할 때는 f를 붙여주어야 함
		double dNum = 0.1; //자바는 실수를 쓰면 다 double로 인식, 일반적으로 double 사용
		long iNum = 10000000000L; //정수는 대부분 int로 인식, long을 쓰고자 할 땐 L 붙여줌, L 안 붙여주고 숫자 키우면 int 범위에서 벗어나므로 빨간줄 뜸
		num = (int)fNum; //강제 캐스팅(묵시적x)
		  //int, float, double... : 정해져 있는 데이터 타입 (primitive data type)
		
		String str; //String : 객체 = 클래스 (객체 타입), jdk 에서 제공해 주는 라이브러리 -> str : 클래스로 선언된 변수
		
		
		System.out.println(num);
		System.out.println(fNum);
		
		
		
		
		Student s = new Student(); 
		//s.studentID = 123; //public 안 붙여 었어서(default상태 => 같은 패키지 내에서만 접근 가능) 빨간줄 뜸
	}

}
