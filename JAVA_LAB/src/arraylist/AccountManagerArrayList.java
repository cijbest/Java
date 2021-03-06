package arraylist;

import java.util.ArrayList;

public class AccountManagerArrayList {

	private ArrayList<Account> accountList;
	
	public AccountManagerArrayList()
	{
		accountList = new ArrayList<Account>();
	}
	
	public void insertAccount(String accountID, String accountName, float balance){
		
		Account account = new Account(accountID, accountName, balance);
		accountList.add(account);
	}
	
	public void setDeposite(String accountId, int money){

		for(int i = 0; i < accountList.size(); i++){
			Account account = accountList.get(i);
			String tempId = account.getAccountID();
			if(accountId.equals(tempId)){
				account.deposite(money);
				return;
			}
		}
		System.out.println("계좌번호 오류 입니다.");
	}
	
	public void displayAll(){
		
		for(Account acc : accountList){
			System.out.println(acc);
		}
	}
	
}
