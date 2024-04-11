package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBMain {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//1단계: 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩완료!!");
			//2단계: DB접속 후 Connection 객체 얻기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("conn: " + conn);
//			DriverManager.getConnection(url정보, 아이디, password);
			//3단계
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5단계: DB연결 해제
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
