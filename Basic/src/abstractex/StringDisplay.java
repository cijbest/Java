package abstractex;

public class StringDisplay extends Display{
	String str;
	public StringDisplay(String str){
		this.str = str;
	}
	
	@Override
	public void start() {
		for(int i = 0; i < str.getBytes().length; i++){ //str ����Ʈ �� ��ŭ�� ���
			System.out.print("=");
		}
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println(str);
	}

	@Override
	public void end() {
		for(int i = 0; i < str.getBytes().length; i++){
			System.out.print("~");
		}
		System.out.println();
	} 

}
