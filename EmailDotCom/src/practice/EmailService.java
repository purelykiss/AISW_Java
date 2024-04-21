package practice;

import kr.ac.kopo.ui.base.UIManager;

public class EmailService {
	public static EmailService instance;
	
	private EmailService() {
		instance = new EmailService();
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

}
