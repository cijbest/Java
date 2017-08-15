package interfaceex;

public class Calculator implements ICalc{ //인터페이스는 여러 개가 와도 된다. ->여기 있는 모든 인터페이스들을 구현하겠다.
   // ↑ 다 구현이 불가능할 때 abstract를 붙여준다. 한 두개만 메소드 구현할 경우.
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	

}
