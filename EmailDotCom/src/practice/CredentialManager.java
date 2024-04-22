package practice;

public class CredentialManager {
	public static CredentialManager instance;
	
	private AccountVO curAccount;
	private SessionVO curSession;
	
	private CredentialManager() {
		instance = new CredentialManager();
		curAccount = null;
		curSession = null;
	}
	
	public static CredentialManager instanciate() throws Exception {
		if(instance == null)
			instance = new CredentialManager();
		else
			throw new Exception("이미 CredentialManager 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("싱글톤 CredentialManager 생성에 실패했습니다.");
		
		return instance;
	}
	
	public static CredentialManager getInstance() throws Exception{
		if(instance == null) {
			throw new Exception("아직 CredentialManager 싱글톤이 만들어지지 않았습니다.");
		}else {
			return instance;
		}
	}
	
	
}
