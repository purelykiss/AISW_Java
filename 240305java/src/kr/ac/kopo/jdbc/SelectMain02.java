package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class SelectMain02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("급여 입력: ");
		int salary = Integer.parseInt(sc.nextLine());

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT JOB_TITLE, AVG(E.SALARY) "
				+ "FROM EMPLOYEES e INNER JOIN JOBS J "
				+ "ON E.JOB_ID = J.JOB_ID "
				+ "WHERE SALARY >= ? "
				+ "GROUP BY J.JOB_TITLE "
				+ "ORDER BY 2 DESC");
		
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		)
		{
			pstmt.setInt(1, salary);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				String jobtitle = rs.getString("job_title");
				int avgSal = rs.getInt(2);
				System.out.printf("[%s] %d\n", jobtitle, avgSal);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
