package exception;

public class Student {
   
   public String name;
   
   public Student(String name){
   
      if(name==null){
         //throws : exception처리를 미루는 것, throw : 내가 exception을 만드는 것
         throw new StudentNameFormatException("이름은 null 일 수 없습니다.");   
      }
      else if(name.split(" ").length > 3){
         throw new StudentNameFormatException("이름이 너무 깁니다.");
      }
      else 
         this.name = name;
   }
   
   

}