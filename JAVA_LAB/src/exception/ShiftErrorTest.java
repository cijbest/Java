package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftErrorTest {

   //throw - exception 처리를 미루는 것 - 얘를 사용하는 쪽에서 로그를 남기는 것이 좋은 경우에 사용 
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
      } catch(Exception e){ //exception의 최상위 클래스 - 모든 exception잡음(default exception) - 맨 마지막에 놓기
         
      }
      finally{
         
      }
      
   }

}