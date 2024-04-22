package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.AccountIDVO;
import kr.ac.kopo.vo.EmailVO;

public class EmailDAO {
	public EmailDAO() {
		
	}//바뀔것: Email에서 번호만 있는 것이 필요
	
	public List<EmailVO> viewEmailList(AccountIDVO id, int many, int page){	//many가 -1일 경우 전부다, page는 1부터
		List<EmailVO> list = new ArrayList();
		
		StringBuilder sql = new StringBuilder();
		String str = id.getID();
		sql.append("SELECT * ");
		sql.append("FROM " + str + "_EMAIL");
		
		try(
			Connection conn =  new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.executeQuery();
			ResultSet rs =  pstmt.getResultSet();
			while(rs.next()) {
				rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void viewEmail(/*어느 테이블, 몇번 이메일?*/) {
		
	}
	
	public void addEmail(/*어느 테이블, 이메일*/) {//보낼때 서비스단에서 보낸 메일함에 하나, 받은 메일함에 하나
		
	}
	
	public void setEmail(/*어느 테이블, 몇번 이메일, 보낼 인덱스*/) {
		
	}
	
	public void removeEmail(/*어느 테이블, 몇번 이메일?*/) {
		
	}	//add
}
