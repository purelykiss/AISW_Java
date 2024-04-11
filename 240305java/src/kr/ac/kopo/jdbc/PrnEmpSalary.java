package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.util.*;

public class PrnEmpSalary {
	boolean flagConnected;
	
	List<String> jobNames;
	List<Integer> avgSalery;
	
	Scanner sc;
	
	int inputSalary;
	
	public PrnEmpSalary() {
		flagConnected = false;
		jobNames = new LinkedList();
		avgSalery = new LinkedList();
		sc = new Scanner(System.in);
		inputSalary = 0;
	}
	
	public static void main(String[] args) {
		PrnEmpSalary pes = new PrnEmpSalary();
		pes.getSQL();
		
		boolean flagExit = false;
		while(!flagExit) {
			pes.getInput();
			if(!(pes.inputSalary > 0)) {
				
			}else {
				pes.calculateOutput();
			}
		}
		
		pes.onFinish();
	}
	
	public void getSQL() {
		//한번 정보를 가져오면 close까지 할건데, 이 경우 다시 가져오면, 오류가 걸리므로 미리 막음
		if(flagConnected)
			return;
		flagConnected = true;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			String sql = "SELECT J.JOB_TITLE, SUM(E.SALARY) / COUNT(1) AVG FROM EMPLOYEES E, JOBS J WHERE E.JOB_ID = J.JOB_ID GROUP BY J.JOB_TITLE ORDER BY AVG";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				jobNames.add(rs.getString("JOB_TITLE"));
				avgSalery.add(rs.getInt("AVG"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	public void getInput() {
		System.out.print("급여를 입력하시요 : ");
		inputSalary = Integer.parseInt(sc.nextLine());
	}
	
	public void calculateOutput() {
		int index = 0;
		boolean flagValueExist = false;
		
		for(;index < avgSalery.size(); index++) {
			if(avgSalery.get(index) >= inputSalary) {
				flagValueExist = true;
				break;
			}
		}
		
		if(!flagValueExist) {
			System.out.println("만족하는 인원이 없습니다.");
			return;
		}
		
		int cnt = 0;
		for(int i = avgSalery.size() -1; i >= index; i--) {
			System.out.printf("[%s] %d\n", jobNames.get(i), avgSalery.get(i));
			cnt++;
		}
		
		System.out.println();
		System.out.printf("총 [%d]명이 검색되었습니다.\n", cnt);
		System.out.println();
	}
	
	public void onFinish() {
		sc.close();
	}
}
