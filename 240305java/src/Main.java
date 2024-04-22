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

		sql.append("INSERT INTO EMAILDOTCOM_SESSION (SESSION_, ID) "
				+ "VALUES(?, ?)");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setInt(1, 134566666);
			pstmt.setString(2, "EE");
			System.out.println(sql.toString());	//디버그
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Date date = new Date();
		
		bw.write(Long.toString(date.getTime()/1000));
        bw.close();
	}
}
