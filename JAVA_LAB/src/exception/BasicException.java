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
            System.out.println(e); //e�� tostring�� ���� 
            //System.out.println(e.getMessage()); //�� exception�� �߻��� �ߴ����� ����
            return;
         }
         finally{ //try�� ����Ǹ� ������ �Ҹ� 
            System.out.println("�׻� �Ҹ��ϴ�");
         }
      }
   
   }