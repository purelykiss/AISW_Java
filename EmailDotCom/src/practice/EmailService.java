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

	public SessionVO TryLogin(AccountVO account) {
		SessionVO session = null;
		session = getSession(account, session);	//session값 갱신 시도
		
		return session;	//로그인 실패시 session = null
	}
	
	public void LoginOut(AccountVO account, SessionVO session) {
		giveUpSession(account, session);
	}
	
	public void CreateAccount() {
		
	}
	
	public void DeleteAccount() {
		
	}
	
	public void ChangeAccountAuthority() {
		
	}
	
	public void BlockAccount() {
		
	}
	
	
	public void ViewEmailList() {
		
	}
	
	public void ViewEmail() {
		
	}
	
	public void SendEmail() {
		
	}
	
	public void MoveEmailTo() {
		
	}
	
	public void RemoveEmail() {
		
	}
	
	
	public SessionVO getSession(AccountVO account, SessionVO session) {	//보안상의 이유로 나중에 변경될 부분
		session = null;
		sessionDAO.tryGetSession(account, session);	//account를 확인하고 session만 바뀜
		
		return session;
	}
	
	public void refreshSession() {
		
	}
	
	public void giveUpSession(AccountVO account, SessionVO session) {	//보안상의 이유로 나중에 변경될 부분
		sessionDAO.tryGiveUpSession(account, session);
	}
}
