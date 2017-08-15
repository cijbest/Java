package student;

public class StaticTest {
	
	int num;
	private static int sNum; //static 변수(=클래스 변수) : 공유되는 변수, 인스턴스가 생성될 때 생성되지 않고 그 이전에 프로그램이 로딩 될 때 데이터영역 혹은 constant라고 하는 곳에 생성
					 //인스턴스와는 관계가 없음, 클래스를 생성하지 않고도 쓸 수 있는 변수
	public StaticTest(int num){
		this.num = num;
		this.num++;
		sNum++;
	}
	public static int getSNum(){ //static을 붙이지 않으면 객체를 생성하지 않는 이상 쓸 수 없기 때문에 static을 붙여 객체 생성 없이 사용할 수 있도록 만듦
		int i = 10;
		//num = 20; // static 메소드 안에서는 인스턴스 변수를 쓸 수 없다. 인스턴스 변수는 인스턴스를 꼭 생성해야만 사용가능하기 때문
		return sNum;
	}
	
	public void printNum(){
		System.out.println("num = " + num);
		System.out.println("sNum = " + sNum);
	}
	
	public static void main(String[] args){
		
		System.out.println(StaticTest.sNum);
		
		StaticTest testA = new StaticTest(10);
		testA.printNum();
		
		StaticTest testB = new StaticTest(10);
		testB.printNum();
		
		testA.printNum();
		
		//결과 : num = 11 sNum = 1 / num = 11 sNum = 2 / num = 11 sNum = 2
	}

}
