package kr.ac.kopo.ui;

import kr.ac.kopo.ui.base.BaseUI;

public class DeleteUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		int no =scanInt("삭제할 게시물 번호를 입력: ");
		
		boolean flagSucceed = service.deleteBoard(no);
		
		if(flagSucceed) {
			System.out.printf("게시글 [%d]번 게시글을 삭제하였습니다\n", no);
		}else {
			System.out.printf("[%d]는 없는 번호입니다\n", no);
		}
	}
	
}
