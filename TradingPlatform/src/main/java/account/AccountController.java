package account;

import java.util.ArrayList;

public class AccountController {
	
	ArrayList<Account> accountList = new ArrayList<Account>();
	
	public void addAccount(){
		Account a = new Account(1,"Gabriel", "ghiggins21@hotmail.com", "ghiggins", "password");
		accountList.add(a);
	}
}
