package student;

public class StaticTest {
	
	int num;
	private static int sNum; //static ����(=Ŭ���� ����) : �����Ǵ� ����, �ν��Ͻ��� ������ �� �������� �ʰ� �� ������ ���α׷��� �ε� �� �� �����Ϳ��� Ȥ�� constant��� �ϴ� ���� ����
					 //�ν��Ͻ��ʹ� ���谡 ����, Ŭ������ �������� �ʰ� �� �� �ִ� ����
	public StaticTest(int num){
		this.num = num;
		this.num++;
		sNum++;
	}
	public static int getSNum(){ //static�� ������ ������ ��ü�� �������� �ʴ� �̻� �� �� ���� ������ static�� �ٿ� ��ü ���� ���� ����� �� �ֵ��� ����
		int i = 10;
		//num = 20; // static �޼ҵ� �ȿ����� �ν��Ͻ� ������ �� �� ����. �ν��Ͻ� ������ �ν��Ͻ��� �� �����ؾ߸� ��밡���ϱ� ����
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
		
		//��� : num = 11 sNum = 1 / num = 11 sNum = 2 / num = 11 sNum = 2
	}

}
