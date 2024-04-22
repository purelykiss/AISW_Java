package practice;

import java.util.Date;
import java.util.Random;

public class SessionGenerator {	//원래 로그인하는 서버에서 시즌을 만들어야 하지만 따로 서버까지 만들기 힘드므로 대신 만듦
	public static SessionGenerator instance;
	Random rd;
	Date date;
	
	private SessionGenerator() {
		instance = new SessionGenerator();
		rd = new Random();
		date = new Date();
	}
	
	public static SessionGenerator instanciate() throws Exception {
		if(instance == null)
			instance = new SessionGenerator();
		else
			throw new Exception("이미 SessionGenerator 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("싱글톤 SessionGenerator 생성에 실패했습니다.");
		
		return instance;
	}
	
	public static SessionGenerator getInstance() throws Exception{
		if(instance == null) {
			throw new Exception("아직 SessionGenerator 싱글톤이 만들어지지 않았습니다.");
		}else {
			return instance;
		}
	}
	
	
	public void clientRequestGetSession(AccountVO account, SessionVO session) {
		if(checkAccountValid(account)) {
			session = generateSession(account);
			setSessionForServer(session);
		}else {
			session = null;
		}
	}
	
	public boolean clientRequestRemoveSession(AccountVO account, SessionVO session) {
		if(checkAccountValid(account)) {
			removeSessionFromServer(session);	//순서 중요
			session = null;
			return true;
		}
		return false;
	}
	
	public void clientRequestRefreshSession(AccountVO account, SessionVO session) {
		boolean flag = true;
		if(!checkAccountValid(account)) {
			flag = false;
		}
		if(!checkSessionValid(session)) {
			flag = false;
		}
		refreshSessionForServer(session);
		if(!flag) {
			session = null;
		}
	}
	
	
	public void setSessionForServer(SessionVO session) {
		//DB에 해당 시즌 정보 추가
	}
	
	public void removeSessionFromServer(SessionVO session) {
		//DB에서 해당 시즌 정보 삭제
	}
	
	public void refreshSessionForServer(SessionVO session) {
		//DB에서 해당 시즌 정보 기한 갱신
	}
	
	
	public boolean checkAccountValid(AccountVO account) {
		//DB에서 해당 계정 정보가 맞는지 검사
		return false;
	}
	
	public boolean checkSessionValid(SessionVO session) {
		//DB에서 해당 시즌 정보가 맞는지 검사
		return false;
	}
	
	public SessionVO generateSession(AccountVO account) {
		String str = account.getID();
		long seed = 0;
		for(int i = 0; i < str.length(); i++ ) {
			int tmp = (int)Math.pow(36, i);
			char ch = str.charAt(str.length() - i - 1);
			if(ch >= '0' && ch <= '9') {
				ch -= '0';
			}else if (ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - 'a' + 10);
			}else if (ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch - 'A' + 10);
			}
			tmp *= (int)ch;
			seed += tmp;
		}
		
		long tmp = date.getTime()/1000;
		seed *= tmp;
		
		rd.setSeed(seed);
		return new SessionVO(account.getID(), rd.nextLong(100000000));
	}
}
