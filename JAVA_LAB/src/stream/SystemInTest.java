package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) throws IOException {

		/*
		System.out.println("엔터를 누르세요");
		
		int i = 0; //초기화 꼭 해주어야 함
		try {
			i = System.in.read(); //read는 항상 int값을 리턴해 주어야 함. -1을 반환하므로
			System.out.println(i);  //\r
			i = System.in.read();   //\n
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		*/

		
		System.out.println("입력 후 엔터를 누르세요");
		
		int i = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in); //읽고 쓰는 기능 없음(wrapper), System.in을 감싸서 한글 처리 해줌
		
		//read는 1바이트 단위로 읽어 들이는데 한글은 2바이트씩 읽어야 하므로 안됨
		while((i = isr.read()) != '끝'){ //출력 버퍼에 넣었다 한꺼번에 화면에 뿌림
			System.out.print((char)i); //i를 넣으면 아스키 값이 찍힘 그러므로 (char) 로 캐스팅 해 줌.
		}

	}

}
