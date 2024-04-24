package kr.ac.kopo.ui.receivedState;

import kr.ac.kopo.singleton.InputManager;
import kr.ac.kopo.singleton.UIManager;
import kr.ac.kopo.ui.mail.BaseMailState;
import kr.ac.kopo.ui.mail.IMailState;
import kr.ac.kopo.ui.mail.IMailUI;

public class ReceivedLobbyState extends BaseMailState {
	
	public ReceivedLobbyState(IMailUI parent){
		super(parent, "lobby", "로비");
	}
	
	@Override
	public void execute() {
		int choice = 0;
		System.out.println("받은 메일함)");
		System.out.println("1. " + parent.getStateDescription(1)); 
		System.out.println("2. " + parent.getStateDescription(2)); 
		System.out.println("3. " + parent.getStateDescription(3)); 
		System.out.println();
		System.out.println();
		boolean flagValid = false; 
		while(!flagValid) {
			System.out.print("원하는 동작을 선택하십시오:");
			choice = InputManager.getInstance().nextInt();
			
			flagValid = true;
			switch(choice) {
			case 1:
				//
				break;
			case 2:
				//
				break;
			case 3:
				//
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 눌러주십시오.");
				flagValid = false;
				break;
			}
		}
	}
}
