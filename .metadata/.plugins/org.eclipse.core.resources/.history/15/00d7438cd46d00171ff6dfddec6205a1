package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AccountManagerHashMap { 
   
   private HashMap<String, Account> accountMap;
   
   public AccountManagerHashMap(){
      accountMap = new HashMap<String, Account>();
   }
   
   public void insertAccount(String accountId, String accountName, float balance){
      Account account = new Account(accountId, accountName, balance);
      Account acc = accountMap.put(accountId, account);
   }
   
   public void setDeposite(String accountId, int money){
      
      accountMap.containsKey(accountId);
      
      Account account = accountMap.get(accountId);
      if (account!=null){
         account.deposite(돈);
      }
      else{
         System.out.println("계좌번호 오류 입니다");
      }
      return;
   }
   
   public void setWithDraw(String accountId, int money){

      Account account = accountMap.get(accountId);
      if (account!=null){
         account.withdraw(돈);
      }
      else{
         System.out.println("계좌번호 오류 입니다");
      }
      return;
   }

   public void displayAll(){

      Set<String> keyset = accountMap.keySet(); //key값을 다 얻어옴, set으로 리턴 - 중복x 
      
      Iterator<String> ir = keyset.iterator();
      while(ir.hasNext()){
         String accountId = ir.next();
         Account account = accountMap.get(accountId);
         System.out.println(account);
      }
   }
   

}