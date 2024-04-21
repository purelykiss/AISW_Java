package practice;

public class SessionVO {
	AccountVO account;
	long session;
	
	public SessionVO(AccountVO account, long session) {
		super();
		this.account = account;
		this.session = session;
	}
	
	public SessionVO(long session) {
		super();
		this.session = session;
	}
	
	public SessionVO() {
		super();
	}

	public AccountVO getAccount() {
		return account;
	}
	
	public String getID() {
		return account.getID();
	}

	public void setAccount(AccountVO account) {
		this.account = account;
	}
	
	public void setID(String id) {
		this.account.setID(id);
	}
	
	public void setPassword(String password) {
		this.account.setPassword(password);
	}

	public long getSession() {
		return session;
	}

	public void setSession(long session) {
		this.session = session;
	}
	
	
}
