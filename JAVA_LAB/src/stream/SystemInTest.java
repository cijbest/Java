package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) throws IOException {

		/*
		System.out.println("���͸� ��������");
		
		int i = 0; //�ʱ�ȭ �� ���־�� ��
		try {
			i = System.in.read(); //read�� �׻� int���� ������ �־�� ��. -1�� ��ȯ�ϹǷ�
			System.out.println(i);  //\r
			i = System.in.read();   //\n
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/

		
		System.out.println("�Է� �� ���͸� ��������");
		
		int i = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in); //�а� ���� ��� ����(wrapper), System.in�� ���μ� �ѱ� ó�� ����
		
		//read�� 1����Ʈ ������ �о� ���̴µ� �ѱ��� 2����Ʈ�� �о�� �ϹǷ� �ȵ�
		while((i = isr.read()) != '��'){ //��� ���ۿ� �־��� �Ѳ����� ȭ�鿡 �Ѹ�
			System.out.print((char)i); //i�� ������ �ƽ�Ű ���� ���� �׷��Ƿ� (char) �� ĳ���� �� ��.
		}

	}

}
