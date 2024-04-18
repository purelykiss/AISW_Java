package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	private int lastBoardNo; //게시글에 번호를 주기 위한 변수
	
	public BoardService() {
		dao = new BoardDAO();
		setCurBoardNo();		
	}
	
	private void setCurBoardNo() {	//나중에 다른 파일에서 마지막 게시글의 번호 값을 여기서 받는다.
		lastBoardNo = 0;	//지금 프로그램 상, ++을 하면 첫 글의 번호가 1이 된다.
	}
	
	public void addBoard(BoardVO board) {
		dao.insert(board);
	}
	
	public boolean deleteBoard(int no) {
		return false; //dao.remove(no);
	}
	
	public List<BoardVO> searchAllBoard() {
		List<BoardVO> list =  dao.selectAll();
		return list;
	}
	
	public BoardVO searchOneBoard(int no) {
		return null; //dao.getByNo(no);
	}
	
	public int update(int no, String title, String writer) {
		int returnStarte = 0;	//이상없음
		BoardVO board = searchOneBoard(no);
		if(board == null) {
			returnStarte = -1;	//게시글 없음
		}else {
			board.setTitle(title);
			board.setWriter(writer);
		}
		return returnStarte;
	}
}
