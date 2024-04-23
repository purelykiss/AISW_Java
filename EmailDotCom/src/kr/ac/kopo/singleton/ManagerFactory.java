package kr.ac.kopo.singleton;
import kr.ac.kopo.ui.base.UIManager;

public class ManagerFactory {
	public static void activate() throws Exception{
		UIManager.instanciate();
		InputManager.instanciate();
		EmailService.instanciate();
		SessionGenerator.instanciate();
		CredentialManager.instanciate();
	}
}