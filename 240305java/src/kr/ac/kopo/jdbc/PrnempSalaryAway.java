package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.*;

public class PrnempSalaryAway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("급여를 입력하시오 : ");
		//String sal = sc.nextLine();
		String sal = "10000";
		Timer timer = new Timer();
		
		timer.startTimer();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		
			conn = new ConnectionFactory().getConnection();
			
			String sql = "select m2.job_title, avg(m1.salary) as avgsal "
					+ "	    from employees m1 join jobs m2 on m1.job_id = m2.job_id "
					+ "    where m1.salary >= to_number(?) "
					+ "	   group by m2.job_title"
					+ "    order by avgsal desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sal);
			
			int cnt = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String job_title = rs.getString("JOB_title");
				String avgsal = rs.getString("avgsal");
				System.out.println("[" + job_title + "] " + avgsal); 
			}
			System.out.println("총 [" + cnt + "]명이 검색되었습니다.");
			timer.endTimer();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

	}

}
