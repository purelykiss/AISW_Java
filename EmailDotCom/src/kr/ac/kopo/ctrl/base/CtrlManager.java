package kr.ac.kopo.ctrl.base;

import kr.ac.kopo.ui.base.UIManager;

public class CtrlManager {
	public static CtrlManager instance;
	
	private CtrlManager() {
		instance = new CtrlManager();
	}
	
	public static CtrlManager instanciate() throws Exception {
		if(instance == null)
			instance = new CtrlManager();
		else
			throw new Exception("이미 CtrlManager 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("CtrlManager 싱글톤 생성에 실패했습니다.");
		
		return instance;
	}
	
	public static CtrlManager getInstance() throws Exception{
		if(instance == null) {
			throw new Exception("아직 CtrlManager 싱글톤이 만들어지지 않았습니다.");
		}else {
			return instance;
		}
	}
	
	private void initialize() {
		
	}
	
	public void activate() throws Exception{
		UIManager.instanciate().activate();
	}
}
