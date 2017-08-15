package deque;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); //<String> : String만 쓰겠다.
		
		list.add(new String("강동원"));
		list.add(new String("김우빈"));
		list.add(new String("송중기"));
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++){
//			String data = (String)list.get(i); //i번째 데이터를 줌, 강제 캐스팅을 해주어야 함 -> ArrayList 타입이므로
			String data = (String)list.get(i); //ArrayList<String> list에서 <String> 해주었기 때문에 강제로 캐스팅 하지 않아도 됨
			System.out.println(data); 
		}
		
	}

}
