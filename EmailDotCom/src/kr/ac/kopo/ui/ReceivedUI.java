package kr.ac.kopo.ui;

import kr.ac.kopo.singleton.InputManager;
import kr.ac.kopo.ui.base.BaseUI;

public class ReceivedUI  extends BaseUI{
	
	public ReceivedUI() {
		super("received", "받은 메일함");
	}

	@Override
	public void execute() {
		int choice = 0;
		System.out.println("받은 메일함)");
		System.out.println("1. 전체보기");
		System.out.println("2. 고유번호로 찾기");
		System.out.println("3. 검색하기");
		System.out.println();
		System.out.println();
		System.out.print("원하는 동작을 선택하십시오:");
		choice = InputManager.getInstance().nextInt();
		
		//switch()
	}
}
