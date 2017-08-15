package exception;

public class Student {
   
   public String name;
   
   public Student(String name){
   
      if(name==null){
         //throws : exceptionó���� �̷�� ��, throw : ���� exception�� ����� ��
         throw new StudentNameFormatException("�̸��� null �� �� �����ϴ�.");   
      }
      else if(name.split(" ").length > 3){
         throw new StudentNameFormatException("�̸��� �ʹ� ��ϴ�.");
      }
      else 
         this.name = name;
   }
   
   

}