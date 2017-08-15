package abstractex;

public abstract class Display { //abstract �Լ��� ������ ������ Ŭ������ abstract���� ��

	public abstract void start(); //�߻� �Լ�
	public abstract void print();
	public abstract void end();
	
	public final void display(){ //���ø� �޼ҵ� (������), �޼ҵ忡 final�� ������ ������ �� �� ����, Ŭ������ final�̸� ��� �Ұ�
		start();
		for(int i = 0; i < 5; i++){
			print();
		}
		end();
	}
	
}