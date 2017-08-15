package innerclass;

interface Sort{

   void sort();
}

class Outer{
   
   private int i = 10;
   
   Inner inner;
   
   public Outer()
   {
      inner = this.new Inner();
   }
   
   class Inner{
   
      public void show(){
         System.out.println(i);
      }
   }

   public Sort getSortAlgorithms(final int i){
      
      final int num = 10 ;
   /*   
      class BubbleSort implements Sort{

         @Override
         public void sort() {
            System.out.println("Bubble Sort");
         }
      }
      return new BubbleSort();
   }
   */
      return new Sort(){ //anonymous interface? anonymous inner class? 

         @Override
         public void sort() {
            System.out.println(num);
            //num = 10;
         }
      };
   }   
   
   Runnable runner = new Runnable(){

      @Override
      public void run() {
         // TODO Auto-generated method stub
         
      }
   };
}

public class InnerTest {

   public static void main(String[] args) {

      Outer out = new Outer(); //안에 있는 inner가 생성이 됨 
      out.inner.show();
      
      Outer.Inner myInner = out.new Inner();
      myInner.show();
      
      Sort s = out.getSortAlgorithms();
      s.sort();
   }

}