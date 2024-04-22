package kr.ac.kopo.dao;

import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.ProfileVO;

public class AccountDAO {
	public AccountDAO() {
		
	}
	
	public void createAccount(ProfileVO profile) {
		
		//계정만들기
		//테이블에 계정이 있는가?
		//없을 경우 테이블에 계정을 추가한다.
	}
	
	public void deleteAccount(AccountVO account) {
		//계정 지우기
		//테이블에 계정이 있는가?
		//비밀번호가 동일한가?
		//모두 참일 경우 테이블에서 계정을 지운다
	}
}
