package practice;
import kr.ac.kopo.ctrl.base.CtrlManager;
import kr.ac.kopo.ui.base.UIManager;

public class ManagerFactory {
	public static void activate() throws Exception{
		CtrlManager.instanciate();
		UIManager.instanciate();
		EmailService.instanciate();
		SessionGenerator.instanciate();
	}
}
