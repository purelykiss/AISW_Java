package kr.ac.kopo.ctrl.base;

import java.util.ArrayList;
import java.util.List;

public class CtrlManager {
	private static CtrlManager instance;
	List<IBoardCtrl> ctrlList;
	IBoardCtrl curctrl;
	
	private CtrlManager() {
		initialize();
	}
	
	private void initialize() {
		ctrlList = new ArrayList<IBoardCtrl>();
	}
	
	public static CtrlManager getInstance() {
		if(instance == null) {
			instance = new CtrlManager();
		}
		return instance;
	}
	
	public void activate() {
		
	}
	
	public boolean changeCtrl(String id) {
		return false;
	}
	
	public boolean changeCtrl(int index) {
		return false;
	}
}
