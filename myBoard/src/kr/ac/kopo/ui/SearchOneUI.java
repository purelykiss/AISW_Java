package kr.ac.kopo.ui;

import kr.ac.kopo.ui.base.BaseUI;
import kr.ac.kopo.vo.BoardVO;

public class SearchOneUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		BoardVO board = null; 
		int no =scanInt("조회할 게시물 번호를 입력: ");
		
		board = service.searchOneBoard(no);
		if(board != null) {
			System.out.println("--------------------------------");
			System.out.println("게시판 번호: "+ board.getNo());
			System.out.println("제목: "+ board.getTitle());
			System.out.println("글쓴이: "+ board.getWriter());
			System.out.println("날자:"+ board.getRegDate());
			System.out.println("--------------------------------");
		}else {
			System.out.printf("번호 [%d]와 일치하는 게시글이 없습니다\n", no);
		}
	}

}
