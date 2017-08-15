package exception;

public class StudentNameFormatException extends IllegalArgumentException{

   String msg;
   public StudentNameFormatException(String msg){
      super(msg);
   }
   
}