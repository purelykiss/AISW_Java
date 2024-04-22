package practice;

public class SessionDAO {
	
	
	public SessionDAO() {
		
	}
	
	public boolean tryGetSession(AccountVO account, SessionVO session){//view, 
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
		boolean flag = false;
		
		try {
			flag = SessionGenerator.getInstance().clientRequestRemoveSession(account, session);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean tryRefreshSession(AccountVO account, SessionVO session) {
		try {
			SessionGenerator.getInstance().clientRequestRefreshSession(account, session);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(session != null)
			return true;
		else
			return false;
	}
}
