package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

/***
 * 새로운 무언가
 * @author User
 *
 */
public class AddUI extends BaseUI{
	@Override
	public void execute() throws Exception {//직접 등록하진 않음. 하지만 
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
