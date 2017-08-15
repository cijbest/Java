package interfaceex;

public interface ICalc { //인터페이스 : 추상 메소드로만 이루어진 것, 인터페이스는 상속이 아니라 구현이다.

	 double PI = 3.14; //상수는 무조건 public static final 됨, 상수는 초기화 꼭 해주어야 함.
	
	int add(int num1, int num2); //public abstract 를 알아서 앞에 붙여줌
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
