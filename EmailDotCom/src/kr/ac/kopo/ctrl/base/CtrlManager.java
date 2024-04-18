package kr.ac.kopo.ctrl.base;

public class CtrlManager {
	public static CtrlManager instance;
	
	private CtrlManager() {
		instance = new CtrlManager();
	}
	
	public static CtrlManager getInstance() throws Exception {
		if(instance == null)
			instance = new CtrlManager();
		else
			throw new Exception("이미 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("싱글톤 생성에 실패했습니다.");
		
		return instance;
	}
	
	private void initialize() {
		
	}
	
}
