package kr.ac.kopo.ui.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.ui.LobbyUI;
import kr.ac.kopo.ui.LoginUI;

public class UIManager {
	public static UIManager instance;
	public Scanner sc;
	public List<IUI> uiList; 
	public IUI curUI;
	
	private UIManager() {
		sc = new Scanner(System.in);
		uiList = new ArrayList();
		uiList.add(new LobbyUI());
		uiList.add(new LoginUI());
		
		curUI = uiList.get(0);
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
	
	public static UIManager getInstance(){
		if(instance == null) {
			System.out.println("아직 UIManager 싱글톤이 만들어지지 않았습니다.");
			return null;
		}else {
			return instance;
		}
	}
	
	public void activate() {
		curUI.execute();
	}
	
	public void ChangeUI(String id) {
		for(IUI item : uiList) {
			if(id.equals(item.getID())) {
				curUI = item;
			}
		}
	}
	
	public void ChangeUI(int index) {
		if(uiList.size() > index)
			curUI = uiList.get(index);
	}
	
	public String getUIDescription(String id) {
		for(IUI item : uiList) {
			if(id.equals(item.getID())) {
				return item.getDescription();
			}
		}
		return null;
	}
	
	public String getUIDescription(int index) {
		if(uiList.size() > index)
			return uiList.get(index).getDescription();
		else
			return null;
	}
	
}
