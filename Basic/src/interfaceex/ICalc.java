package interfaceex;

public interface ICalc { //�������̽� : �߻� �޼ҵ�θ� �̷���� ��, �������̽��� ����� �ƴ϶� �����̴�.

	 double PI = 3.14; //����� ������ public static final ��, ����� �ʱ�ȭ �� ���־�� ��.
	
	int add(int num1, int num2); //public abstract �� �˾Ƽ� �տ� �ٿ���
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
