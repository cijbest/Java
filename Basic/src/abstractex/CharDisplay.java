package abstractex;

public class CharDisplay extends Display{//�߻� Ŭ������ ��� �޾����Ƿ� Ŭ������ �߻� Ŭ������ ����ų� �Ӽ����� �������־�� ��

	char ch;
	
	public CharDisplay(char ch){
		this.ch = ch;
	}
	
	@Override
	public void start() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void end() {
		System.out.print(">>");
	} 
}