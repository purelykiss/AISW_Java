package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/***
 * oracle dbms에서 게시판 crud (select delete update insert)
 */

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {
	private List<BoardVO> list;
	
	public BoardDAO() {
		list = new ArrayList<BoardVO>();
	}
	
	public void insert(BoardVO board) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO TBL_BOARD (NO, TITLE, WRITER)");
		sql.append("	VALUES(SEQ_TBL_BOARD_NO.NEXTVAL, ?, ?)");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			String title = board.getTitle();
			String writer = board.getWriter();
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<BoardVO> selectAll() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT NO, TITLE, WRITER, TO_CHAR(REG_DATE, 'YYYY-MM-DD') AS REG_DATE ");
		sql.append("FROM TBL_BOARD");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("NO");
				String title = rs.getString("TITLE");
				String writer = rs.getString("WRITER");
				String reg_date = rs.getString("REG_DATE");
				
				BoardVO board = new BoardVO();
				
				board.setNo(no);
				board.setTitle(title);
				board.setWriter(writer);
				board.setRegDate(reg_date);
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
