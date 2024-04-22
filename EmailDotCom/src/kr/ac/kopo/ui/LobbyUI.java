package kr.ac.kopo.ui;

import kr.ac.kopo.singleton.InputManager;
import kr.ac.kopo.ui.base.BaseUI;
import kr.ac.kopo.ui.base.UIManager;

public class LobbyUI extends BaseUI{
	private boolean flagLogo;
	
	public LobbyUI() {
		super("lobby","로비");
		flagLogo = true;
	}

	@Override
	public void execute() {
		if(flagLogo) {
			flagLogo = false;
			System.out.println("********************");
			System.out.println("Email.com");
			System.out.println("********************");
			
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("로비) 원하시는 동작을 선택하십시오.");
		System.out.println("1. " + UIManager.getInstance().getUIDescription(1)); //로그인
		System.out.println("2. " + UIManager.getInstance().getUIDescription(2)); //아이디 비밀번호 찾기
		System.out.println("3. " + UIManager.getInstance().getUIDescription(3)); //회원가입
		System.out.println();
		System.out.println();
		
		boolean flag = false;
		int input = 0;
		while(!flag) {
			flag = true;
			input = InputManager.getInstance().nextInt();
			if(input <= 3) {
				UIManager.getInstance().ChangeUI(input);
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력하십시오.");
			}
		}
	}
}
