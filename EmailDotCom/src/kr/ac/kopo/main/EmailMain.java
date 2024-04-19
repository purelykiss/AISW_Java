package kr.ac.kopo.main;


import kr.ac.kopo.ctrl.base.CtrlManager;
import kr.ac.kopo.ui.base.UIManager;

public class EmailMain {
	public static void main(String[] args) {
		
		try {
			CtrlManager.getInstance();
			while(true) {
				UIManager.getInstance().activate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}