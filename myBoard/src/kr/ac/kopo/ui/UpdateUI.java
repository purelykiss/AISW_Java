package kr.ac.kopo.ui;

import kr.ac.kopo.ui.base.BaseUI;
import kr.ac.kopo.vo.BoardVO;

public class UpdateUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		System.out.println("<<< 게시글 수정 서비스 >>>");
		int state;
		
		int no = scanInt("수정할 글번호를 입력하세요");
		String title = scanStr("수정할 제목을 입력하세요");
		String writer = scanStr("수정할 작성자를 입력하세요");
		state = service.update(no, title, writer);
		switch(state) { //1.7v이상만 사용 가능한 ->문
			case 0 -> {
				System.out.printf("게시글 [%d]번 게시글을 수정하였습니다\n", no);
			}
			case -1 -> {
				System.out.printf("오류: [%d]번 게시글이 존제하지 않습니다\n", no);
			}
		}
		
	}

}
