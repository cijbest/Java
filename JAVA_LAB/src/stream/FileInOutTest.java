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
      OutputStreamWriter osw = null; // ���μ� �� �� ����ũ��

      try {
         fos = new FileOutputStream("out.txt", true);// byte ������
         osw = new OutputStreamWriter(fos);
         //osw = new FileWriter(fos); //FileReader�� ���� ��

         /*
         fos.write(65); //A
         fos.write(66); //B
         fos.write(67); //C
         */
         
         osw.write(65); //A
         osw.write(66); //B
         osw.write(67); //C
         osw.write("������");

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
      //������ �о ���
      int i;
      FileInputStream fis = null;
      InputStreamReader isr = null;
      
      try {
		fis = new FileInputStream("out.txt");
		//fis = new FileReader("out.txt"); -> FileReader�� �ϸ� ���� �ʿ䰡 ���� (���ڿ� �ٷ� �� �� ����)
		isr = new InputStreamReader(fis);
		/*
		while(( i = fis.read()) != -1){ //��� ���ۿ� �־��� �Ѳ����� ȭ�鿡 �Ѹ�
			System.out.print((char)i); //i�� ������ �ƽ�Ű ���� ���� �׷��Ƿ� (char) �� ĳ���� �� ��.
		}*/
		
		while(( i = isr.read()) != -1){ //��� ���ۿ� �־��� �Ѳ����� ȭ�鿡 �Ѹ�, ������ ������ ���� �� -1�� �� ����Ѵ١�
			System.out.print((char)i); //i�� ������ �ƽ�Ű ���� ���� �׷��Ƿ� (char) �� ĳ���� �� ��.
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