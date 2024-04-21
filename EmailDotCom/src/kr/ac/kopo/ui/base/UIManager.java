package kr.ac.kopo.ui.base;

public class UIManager {
	public static UIManager instance;
	
	private UIManager() {
		instance = new UIManager();
	}
	
	public static UIManager instanciate() throws Exception {
		if(instance == null)
			instance = new UIManager();
		else
			throw new Exception("이미 UIManager 싱글톤이 있습니다.");
		if(instance == null)
			throw new Exception("UIManager 싱글톤 생성에 실패했습니다.");
		
		return instance;
	}
	
	public static UIManager getInstance() throws Exception{
		if(instance == null) {
			throw new Exception("아직 UIManager 싱글톤이 만들어지지 않았습니다.");
		}else {
			return instance;
		}
	}
	
	private void initialize() {
		
	}
	
	public void activate() {
		
	}
	
}
