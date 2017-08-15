package hashmap;

public class Account {

   private String accountId;
   private String accountName;
   private float balance;
   
   
   public Account(String accountId, String accountName, float balance){
      this.accountId = accountId;
      this.accountName = accountName;
      this.balance = balance;
   }
   
   public void deposite(int money){
      if(money <= 0){
         System.out.println("not enough money");
         return ;
      }
      balance += money;
   }
   
   public void withdraw(int money){
      if(balance >= money){
         System.out.println("not enough money");
         return ;
      }
      balance -= money;
   }
   
   public String getAccountId() {
      return accountId;
   }
   
   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }
   
   public String getAccountName() {
      return accountName;
   }
   
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }
   
   public float getBalance() {
      return balance;
   }
   
   public void setBalance(float balance) {
      this.balance = balance;
   }
   
   public String toString(){
      return accountName + "님의 계좌번호는 "+accountId+"이며, 잔고는 "+balance+"입니다.";
   }
   
   
   
   
   
}