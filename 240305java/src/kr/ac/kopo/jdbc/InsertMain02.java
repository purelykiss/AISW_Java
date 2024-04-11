package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		String sql = "insert into t_test(id, name) ";
		sql += "values(\'" + id + "\', \'"+ name + "\') "; //뒤에 space를 붙이는 이유: DB에서 볼때 가시성을 위해
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			//3단계: 쿼리실행객체 생성
			stmt = conn.createStatement();	//create했으니 close()도 해야됨
			
			//4단계: 쿼리 실행 후 결과 얻기
			int cnt = stmt.executeUpdate(sql); //총 몇개가 변했는지 int 수를 리턴
			System.out.println("총 " + cnt + "개 바뀌었습니다");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(stmt != null) {
			try {
				stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
