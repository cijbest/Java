package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftErrorTest {

   //throw - exception ó���� �̷�� �� - �긦 ����ϴ� �ʿ��� �α׸� ����� ���� ���� ��쿡 ��� 
   public URL makeUrl(String fileName, String url) throws FileNotFoundException, MalformedURLException{
      
      FileInputStream fis = new FileInputStream(fileName);
      return new URL(url);
   }
   
   
   public static void main(String[] args) {

      ShiftErrorTest shift = new ShiftErrorTest();
      try {
         shift.makeUrl("a.txt", "http://www.google.com");
      } catch (FileNotFoundException e) {
         System.out.println(e);
      } catch (MalformedURLException e) {
         System.out.println(e);
      } catch(Exception e){ //exception�� �ֻ��� Ŭ���� - ��� exception����(default exception) - �� �������� ����
         
      }
      finally{
         
      }
      
   }

}