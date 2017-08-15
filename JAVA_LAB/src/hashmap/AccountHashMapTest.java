package hashmap;

public class AccountHashMapTest {

   public static void main(String[] args) {

      AccountManagerHashMap manager = new AccountManagerHashMap();
      
      manager.insertAccount("1234", "1g", 10000);
      manager.insertAccount("12345", "2g", 20000);
      manager.insertAccount("123456", "3g", 30000);
      manager.insertAccount("1234567", "4g", 40000);
      
      manager.setDeposite("1234", 500);
      manager.setWithDraw("1234", 5);
      manager.displayAll();
   }

}