package kr.ac.kopo.singleton;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.dao.ProfileDAO;
import kr.ac.kopo.dao.EmailDAO;
import kr.ac.kopo.dao.SessionDAO;
import kr.ac.kopo.ui.base.UIManager;
import kr.ac.kopo.vo.AccountIDVO;
import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.ProfileVO;
import kr.ac.kopo.vo.SessionVO;

public class EmailService {
	public static EmailService instance;

	private ProfileDAO profileDAO;
	private SessionDAO sessionDAO;
	private EmailDAO emailDAO;
	
	private EmailService() {
		profileDAO = new ProfileDAO();
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
	
	public static EmailService getInstance(){
		if(instance == null) {
			System.out.println("아직 EmailService 싱글톤이 만들어지지 않았습니다.");
			return null;
		}else {
			return instance;
		}
	}

	public boolean login(AccountVO account) {
		SessionVO session = getSession(account);	//session값 갱신 시도
		if(session != null) {
			CredentialManager.getInstance().login(account, session);
			return true;
		}
		
		return false;	//로그인 실패시 session = null
	}
	
	public void logOut(AccountVO account, SessionVO session) {
		giveUpSession(account, session);
		CredentialManager.getInstance().logout(account, session);
	}
	
	public boolean createProfile(ProfileVO profile) {
		return profileDAO.createProfile(profile);
	}
	
	public void deleteProfile(AccountVO account) {
		profileDAO.deleteProfile(account);
	}
	
	public List<AccountIDVO> getAccountIDList(ProfileVO profile) {
		return profileDAO.getAccountIDList(profile);
	}
	
	public AccountVO getAccount(ProfileVO profile) {
		return profileDAO.getAccount(profile);
	}
	
	public boolean IsAccountIDExist(AccountIDVO id) {
		return profileDAO.IsAccountExist(id);
	}
	
	public boolean IsEmailExist(ProfileVO profile) {
		return profileDAO.IsEmailExist(profile);
	}

	/*public void changeAccountAuthority(AccountVO account) {
		
	}*/
	
	/*public void blockAccount(AccountVO myAccount, AccountIDVO targetID) {
		
	}*/
	
	
	public void viewEmailList() {
		
	}
	
	public void viewEmail() {
		
	}
	
	public void sendEmail() {
		
	}
	
	public void moveEmailTo() {
		
	}
	
	public void removeEmail() {
		
	}
	
	
	public SessionVO getSession(AccountVO account) {
		return sessionDAO.tryGetSession(account);
	}
	
	public boolean refreshSession(AccountVO account, SessionVO session) {
		return sessionDAO.tryRefreshSession(account, session);
	}
	
	public boolean giveUpSession(AccountVO account, SessionVO session) {
		return sessionDAO.tryGiveUpSession(account, session);
	}
}
