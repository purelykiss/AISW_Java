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
	
	public List<EmailVO> getEmailList(int emailPerPage, int page){
		List<EmailVO> emailList = new ArrayList();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT CODE, "
				+ "       TITLE, "
				+ "       SENDER_NAME,"
				+ "		  SENDER_ID, "
				+ "       TO_CHAR(SNT_DATE, 'YYYY/MM/DD') AS DATE "
				+ "FROM EMAILDOTCOM_EE_SENT_MAIL "
				+ "WHERE ROWNUM BETWEEN ? AND ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setInt(1, ((page-1)*emailPerPage + 1 >0) ? (page-1)*emailPerPage + 1 : 1 );
			pstmt.setInt(2, (page*emailPerPage >0) ? page*emailPerPage : 1 );
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				EmailVO item = new EmailVO();
				item.setCode(rs.getInt(1));
				item.setTitle(rs.getString(2));
				item.setSenderID(rs.getString(4));
				item.setSenderName(rs.getString(3));
				item.setDate(rs.getString(5));
				emailList.add(new EmailVO());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emailList;
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
