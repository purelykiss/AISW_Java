package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService() {
		dao = new BoardDAO();
	}
	
	public void addBoard(BoardVO board) {
		//게시판번호
		
		
		//현제날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	//소문자m는 분이된다
		String date = sdf.format(new Date());
		board.setRegDate(date);
		
		dao.insert(board);
	}
	
	public List<BoardVO> searchAllBoard() {
		List<BoardVO> list =  dao.selectAll();
		return list;
	}
}
