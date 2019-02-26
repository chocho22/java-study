package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest {

	static void exceptionTest() throws Exception {
		
	}
	public static void main(String[] args) {
		try {
			exceptionTest();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("title")+",");
				System.out.print(rs.getString("num")+",");
				System.out.print(rs.getString("reg_date")+",");
				System.out.print(rs.getString("content"));
				System.out.println();
			}
			System.out.println("연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 해시맵으로 만들어서 리스트에 넣어서... 출력????
	}
}
