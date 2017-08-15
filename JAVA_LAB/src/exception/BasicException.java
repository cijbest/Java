package exception;

public class BasicException {

   public static void main(String[] args) {

      String[] greetings = {"hello","hi","how r u"};
      //for(int i=0; i<4;i++){
      
      int i=4;
      
      try{
            System.out.println(greetings[i]);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e); //e의 tostring이 찍힘 
            //System.out.println(e.getMessage()); //왜 exception이 발생을 했는지가 찍힘
            return;
         }
         finally{ //try가 실행되면 무조건 불림 
            System.out.println("항상 불립니다");
         }
      }
   
   }