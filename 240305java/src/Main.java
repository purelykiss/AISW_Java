import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import kr.ac.kopo.util.ConnectionFactory;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		StringBuilder sql = new StringBuilder();
		
		Connection conn = null;
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		
		sql.append("SELECT * ");
		sql.append("FROM " + str);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs =  pstmt.getResultSet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Date date = new Date();
		
		bw.write(Long.toString(date.getTime()/1000));
        bw.close();
	}
}
