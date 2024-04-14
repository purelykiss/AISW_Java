package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import kr.ac.kopo.util.*;

public class InsertMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디입력: ");
		String id = sc.nextLine();
		System.out.print("이름입력: ");
		String name = sc.nextLine();
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();	//어팬드를 이용해서 변화를 유도
			sql.append("insert into t_test(id, name) ");
			sql.append("values(?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			pstmt.executeUpdate();
			System.out.println("삽입완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
