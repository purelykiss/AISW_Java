package practice;

public class SessionDAO {
	
	
	public SessionDAO() {
		
	}
	
	public boolean tryGetSession(AccountVO account, SessionVO session){
		try {
			SessionGenerator.getInstance().clientRequestGetSession(account, session);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(session != null)
			return true;
		else
			return false;
	}
	
	public boolean tryGiveUpSession(AccountVO account, SessionVO session) {
		return false;
	}
}
