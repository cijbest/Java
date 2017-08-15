package stream;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("jcw.gif");
		FileOutputStream fos = new FileOutputStream("copy.gif");
		
		BufferedInputStream bis = new BufferedInputStream(fis); //�� ����Ʈ�� ���� �ʰ� �Ѳ����� �о� �����ϹǷ� ������ ����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long pseconds = System.currentTimeMillis(); //�󸶳� �ɸ���
		
		int i = 0;
		while((i = bis.read()) != -1 ){
			fos.write(i);
		}
		
		pseconds = System.currentTimeMillis() - pseconds;
		System.out.println(pseconds + "milliseconds");
		
		//fis.close();
		//fos.close();
		
		fis.close();
		bos.close();
		
		Socket socket = new Socket();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // InputStreamReader �̿��ؼ� �ѱ� ��� �����ϰ� ����
	}

}