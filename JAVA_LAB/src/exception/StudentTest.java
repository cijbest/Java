package exception;

import java.rmi.StubNotFoundException;

public class StudentTest {

   public static void main(String[] args) {

      try{
         Student std1 = new Student(null);
      }
      catch(StudentNameFormatException e){
         System.out.println(e.getMessage());
      }
      
      try{
         Student std2 = new Student("a b c d");
      }
      catch(StudentNameFormatException e){
         System.out.println(e.getMessage());
      }
   }

}