package kr.ac.kopo.ui.base;

public class UIManager {
	public static UIManager instance;
	
	private UIManager() {
		instance = new UIManager();
	}
	
	public static UIManager getInstance() throws Exception {
		if(instance == null)
			instance = new UIManager();
		else
			throw new Exception("이미 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("싱글톤 생성에 실패했습니다.");
		
		return instance;
	}
	
	private void initialize() {
		
	}
	
	public void activate() {
		
	}
	
}
