package practice;
import kr.ac.kopo.ctrl.base.CtrlManager;
import kr.ac.kopo.ui.base.UIManager;

public class LoopField {
	public LoopField() {}
	
	public void Activate() {
		try {
			ManagerFactory.activate();
			while(true) {
				CtrlManager.instanciate().activate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
