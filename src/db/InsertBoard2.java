package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.board.DBCon;

public class InsertBoard2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String title = "제목";
			String content = "내용";
			String sql = "insert into board_info(bi_num,bi_title,bi_content," +
					"bi_credat,bi_cretim)";
			sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD')," +
					"to_char(sysdate,'HH24MISS'))";
			System.out.println(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 1개가 입력되었다.");
			} else if(cnt==0) {
				System.out.println("안들어갔다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
}
