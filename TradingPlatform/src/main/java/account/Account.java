package account;

public class Account {
	int accountId;
	String name;
	String  email;
	String username;
	String password;
	
	public Account(int accountId, String name, String email, String username, String password){
		this.accountId = accountId;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
