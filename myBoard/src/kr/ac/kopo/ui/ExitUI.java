package kr.ac.kopo.ui;

import kr.ac.kopo.ui.base.BaseUI;

public class ExitUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("------------------------------------");
		System.out.println("\t 게시판 프로그램을 종료합니다.");
		System.out.println("------------------------------------");
		System.exit(0);
	}
	
}
