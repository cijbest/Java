package student;

public class Student { //class = 객체들의 청사진
	
	private int studentID; // public : 접근 제어자(modifier)
	private String studentName; //private : 같은 패키지 내에서도 못 씀. ->메소드 이용해서 가져다 씀
	private static int serialNum = 10000; //★★★★★(생성자가 만들어 질 때마다 학번이 1씩 증가하여 studentID에 부여됨. studentID를 공유하게 되면 각 사람의 학번이 바뀌므로 static변수를 하나 생성하여 적용)
	
	public static final int MAX = 100; //final : 상수가 절대로 바뀌지 않게 함
	public static final int MIN = 0;
	
	private int month; //private : 은닉
	public void setMonth(int mon){
		if(mon < 0 || mon > 12){
			System.out.println("error");
			return;
		}
	}
	
	
	
	public Student(){ // default 생성자, body, 몸체 / 생성자가 하나라도 있으면 디폴트 새성자를 반드시 명시 -> 그렇지 않으면, new Student() 에러남.
		serialNum++;//★★★★★
		this.studentID = serialNum;//★★★★★
	}
	public Student(int studentID){ //객체가 실행됬을 때 수행해야하는 것을 명시
		this.studentID = studentID;
	}
	
	/*
	public void setStudentID(int studentID){
		int i = 10; // i = 로컬변수(지역변수) -----> stack에 쌓였다가 로컬이 있는 영역이 끝나면 삭제, 함수도 stack 사용
		
		this.studentID = studentID; //매개변수의 이름이 개체 변수와 이름이 같을 때 구분하기 위해 this 사용
	
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
