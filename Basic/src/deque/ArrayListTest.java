package deque;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); //<String> : String�� ���ڴ�.
		
		list.add(new String("������"));
		list.add(new String("����"));
		list.add(new String("���߱�"));
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++){
//			String data = (String)list.get(i); //i��° �����͸� ��, ���� ĳ������ ���־�� �� -> ArrayList Ÿ���̹Ƿ�
			String data = (String)list.get(i); //ArrayList<String> list���� <String> ���־��� ������ ������ ĳ���� ���� �ʾƵ� ��
			System.out.println(data); 
		}
		
	}

}
