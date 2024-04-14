package kr.ac.kopo.ctrl;

import kr.ac.kopo.ctrl.base.BaseCtrl;
import kr.ac.kopo.vo.BoardVO;

public class AddCtrl extends BaseCtrl{
	public void execute() throws Exception {
		System.out.println("<<< 게시글 등록 서비스 >>>");
		String title = scanStr("등록할 제목을 입력하세요: ");
		String writer = scanStr("등록할 작성자를 입력하세요: ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		service.addBoard(board);
		
		System.out.println();
	}
}
