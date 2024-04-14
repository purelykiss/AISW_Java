package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {
	private List<BoardVO> list;
	
	public BoardDAO() {
		list = new ArrayList();
	}
	
	public void insert(BoardVO board) {
		list.add(board);
	}
	
	public int size() {
		return list.size();
	}
	
	public List<BoardVO> selectAll() {
		return list;
	}
	
	public boolean remove(int no) {
		boolean flagExist = false;
		for(BoardVO item : list) {
			if(item.getNo() == no) {
				flagExist = list.remove(item);
				break;
			}
		}
		return flagExist;
	}
	
	public BoardVO getByNo(int no) {
		for(BoardVO item : list) {
			if(item.getNo() == no) {
				return item;
			}
		}
		return null;
	}
}
