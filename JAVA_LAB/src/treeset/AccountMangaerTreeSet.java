package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class AccountMangaerTreeSet {
	
	private TreeSet<Account> accountSet;
	
	public AccountMangaerTreeSet(){
		accountSet = new TreeSet<Account>();
	}

	public void insertAccount(String accountID, String accountName, float balance){
		
		Account account = new Account(accountID, accountName, balance);
		accountSet.add(account);
	}
	
	public void setDeposite(String accountID, int money){
		Iterator<Account> ir = accountSet.iterator(); //get�� ���� ���ϹǷ�
		while(ir.hasNext()){
			Account acc = ir.next();
			String temp = acc.getAccountID();
			if(temp.equals(accountID)){
				acc.deposite(money);
				return;
			}
		}
		System.out.println("���¹�ȣ �����Դϴ�.");
		
	}
	
	public void displayAll(){
		for(Account acc : accountSet){
			System.out.println(acc); // ������ ������� ��µ�
		}
	}
}
