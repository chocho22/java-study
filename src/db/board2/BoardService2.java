package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board2.DBCon2;


public class BoardService2 {
	public static List<BoardInfoVO2> selectBoard2() {
		String sql = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DBCon2.getCon();
		System.out.println("연결성공");
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO2> biList = new ArrayList<>();
			while (rs.next()) {
				BoardInfoVO2 bi = new BoardInfoVO2();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCnt(rs.getInt("bi_cnt"));
				bi.setBiIsactive(rs.getString("bi_isactive"));
				biList.add(bi);
			}
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon2.close();
		}
		return null;
	}
}
