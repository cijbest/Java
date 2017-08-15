package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileInOutTest {
   public static void main(String[] args) {

      FileOutputStream fos = null;
      OutputStreamWriter osw = null; // 감싸서 더 함 휘핑크림

      try {
         fos = new FileOutputStream("out.txt", true);// byte 단위로
         osw = new OutputStreamWriter(fos);
         //osw = new FileWriter(fos); //FileReader와 같이 씀

         /*
         fos.write(65); //A
         fos.write(66); //B
         fos.write(67); //C
         */
         
         osw.write(65); //A
         osw.write(66); //B
         osw.write(67); //C
         osw.write("하하하");

      } catch (IOException e) {
         System.out.println(e);
      } finally{
         
         try {
            //fos.close();
        	 osw.close();
         } catch (IOException e) {
            System.out.println(e);
         }
      }
      //끝까지 읽어서 출력
      int i;
      FileInputStream fis = null;
      InputStreamReader isr = null;
      
      try {
		fis = new FileInputStream("out.txt");
		//fis = new FileReader("out.txt"); -> FileReader로 하면 감쌀 필요가 없음 (문자열 바로 쓸 수 있음)
		isr = new InputStreamReader(fis);
		/*
		while(( i = fis.read()) != -1){ //출력 버퍼에 넣었다 한꺼번에 화면에 뿌림
			System.out.print((char)i); //i를 넣으면 아스키 값이 찍힘 그러므로 (char) 로 캐스팅 해 줌.
		}*/
		
		while(( i = isr.read()) != -1){ //출력 버퍼에 넣었다 한꺼번에 화면에 뿌림, ★파일 끝까지 읽을 때 -1을 꼭 사용한다★
			System.out.print((char)i); //i를 넣으면 아스키 값이 찍힘 그러므로 (char) 로 캐스팅 해 줌.
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			//fis.close();
			isr.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
      

      

   }
}
