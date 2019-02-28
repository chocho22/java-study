package db.board2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon2 {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "osfu";
	private static final String PWD = "12345678";
	private static Connection con;
	
	DBCon2() {
	}
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL,USER,PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
		System.out.println(con);
	}
}
