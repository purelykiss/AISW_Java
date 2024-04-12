package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		List<BoardVO> list = service.searchAllBoard();
		
		System.out.println("----------------------------------");
		System.out.println("전체 게시글 목록");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		if(list.isEmpty()) {
			System.out.println("글이 없습니다");
		}else {
			for(BoardVO board : list) {
				System.out.println(board.getNo() + "\t" + board.getRegDate() + "\t" +board.getWriter() + "\t" + board.getTitle());
			}
		}
	}
	
}
