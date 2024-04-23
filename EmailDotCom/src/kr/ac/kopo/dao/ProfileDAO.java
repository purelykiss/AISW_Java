package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.AccountIDVO;
import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.ProfileVO;

public class ProfileDAO {
	public ProfileDAO() {
		
	}
	
	public boolean createProfile(ProfileVO profile) {
		//계정만들기 
		//테이블에 계정이 있는가?
		//없을 경우 테이블에 계정을 추가한다.
		boolean flag = false;
		
		StringBuilder sql = new StringBuilder();

		sql.append("INSERT INTO EMAILDOTCOM_PROFILE (ID, PASSWD, NM, BIRTHDAY, EMAIL, CHARGE, BLOCKED) "
				+ " VALUES(?, ?, ?, ?, ?, '0', '0') ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, profile.getID());
			pstmt.setString(2, profile.getPassword());
			pstmt.setString(3, profile.getName());
			pstmt.setString(4, profile.getBirthday());
			pstmt.setString(5, profile.getEmail());
			pstmt.executeUpdate();
			flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public void deleteProfile(AccountVO account) {
		//계정 지우기
		//테이블에 계정이 있는가?
		//비밀번호가 동일한가?
		//모두 참일 경우 테이블에서 계정을 지운다
	}
	
	public List<AccountIDVO> getAccountIDList(ProfileVO profile) {
		List<AccountIDVO> idList = new ArrayList<AccountIDVO>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID "
				+ "FROM EMAILDOTCOM_PROFILE "
				+ "WHERE NM = ? "
				+ "  AND TO_CHAR(BIRTHDAY, 'YYYYMMDD') = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, profile.getName());
			pstmt.setString(2, profile.getBirthday());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("ID");
				idList.add(new AccountIDVO(id));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return idList;
	}
	
	public AccountVO getAccount(ProfileVO profile) {

		AccountVO account = null;
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID, PASSWD "
				+ "FROM EMAILDOTCOM_PROFILE "
				+ "WHERE ID = ? "
				+ "  AND EMAIL = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, profile.getID());
			pstmt.setString(2, profile.getEmail());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				account = new AccountVO();
				String id = rs.getString("ID");
				String passwd = rs.getString("PASSWD");
				account.setID(id);
				account.setPassword(passwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return account;
	}
	
	public boolean IsAccountExist(AccountIDVO id) {
		
		boolean flagExist = false;
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID "
				+ "FROM EMAILDOTCOM_PROFILE "
				+ "WHERE ID = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, id.getID());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				flagExist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flagExist;
	}
	
	public boolean IsEmailExist(ProfileVO profile) {

		boolean flagExist = false;
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT EMAIL "
				+ "FROM EMAILDOTCOM_PROFILE "
				+ "WHERE EMAIL = ? ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, profile.getEmail());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				flagExist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flagExist;
	}
}
