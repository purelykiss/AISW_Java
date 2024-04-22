package practice;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ui.base.UIManager;

public class EmailService {
	public static EmailService instance;

	private AccountDAO accountDAO;
	private SessionDAO sessionDAO;
	private EmailDAO emailDAO;
	
	private EmailService() {
		instance = new EmailService();
		
		accountDAO = new AccountDAO();
		sessionDAO = new SessionDAO();
		emailDAO = new EmailDAO();
	}
	
	public static EmailService instanciate() throws Exception {
		if(instance == null)
			instance = new EmailService();
		else
			throw new Exception("이미 EmailService 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("싱글톤 EmailService 생성에 실패했습니다.");
		
		return instance;
	}
	
	public static EmailService getInstance() throws Exception{
		if(instance == null) {
			throw new Exception("아직 EmailService 싱글톤이 만들어지지 않았습니다.");
		}else {
			return instance;
		}
	}

	public SessionVO tryLogin(AccountVO account) {
		SessionVO session = null;
		session = getSession(account, session);	//session값 갱신 시도
		
		return session;	//로그인 실패시 session = null
	}
	
	public void loginOut(AccountVO account, SessionVO session) {
		giveUpSession(account, session);
	}
	
	public void createAccount(ProfileVO profile) {
		accountDAO.createAccount(profile);
	}
	
	public void deleteAccount(AccountVO account) {
		accountDAO.deleteAccount(account);
	}
	
	/*public void changeAccountAuthority(AccountVO account) {
		
	}*/
	
	/*public void blockAccount(AccountVO myAccount, AccountIDVO targetID) {
		
	}*/
	
	
	public void viewEmailList() {
		emailDAO;//
	}
	
	public void viewEmail() {
		
	}
	
	public void sendEmail() {
		
	}
	
	public void moveEmailTo() {
		
	}
	
	public void removeEmail() {
		
	}
	
	
	public SessionVO getSession(AccountVO account, SessionVO session) {
		session = null;
		sessionDAO.tryGetSession(account, session);	//account를 확인하고 session만 바뀜
		
		return session;
	}
	
	public boolean refreshSession(AccountVO account, SessionVO session) {
		return sessionDAO.tryRefreshSession(account, session);
	}
	
	public boolean giveUpSession(AccountVO account, SessionVO session) {
		return sessionDAO.tryGiveUpSession(account, session);
	}
}
