package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService21 {
	public Board12InfoVO selectBoard(String num) {
		String sql = "select * from board12";
		if("1".equals(num)) {
			sql += " where title=?";
		} else if ("2".equals(num)) {
			sql += " where content=?";
		} else if ("3".equals(num)){
			sql += "";
		}
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs;
			Board12InfoVO bi = new Board12InfoVO();
			if("1".equals(num)) {
				ps.setString(1, bi.getTitle());
			} else if ("2".equals(num)) {
				ps.setString(1, bi.getContent());
			}
			rs = ps.executeQuery();
			System.out.println("제목");
			while (rs.next()) {
				System.out.println(rs.getString("title"));
			}
			return bi;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insertBoard(String title, String content) {
		String sql = "insert into board12(num,title,content,\r\n" + "credat)";
		sql += "values(seq_board12_num.nextval,?,?,sysdate)";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상적으로 게시물이 등록 완료됨");
			} else if (cnt == 0) {
				System.out.println("왜안되냐..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBoard(Integer num, String title, String content) {
		String sql = "update board12 set title=?, content=? where num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, num);
			int cnt = ps.executeUpdate();
			if (cnt >= 1) {
				System.out.println(num + "번 게시글이 정상적으로 수정되었습니다.");
			} else {
				System.out.println("입력한 " + num + "번 게시글이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBoard(Integer num) {
		String sql = "delete from Board12 where num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setInt(1, num);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println(num + "번 게시글이 정상적으로 삭제되었습니다.");
			} else {
				System.out.println("입력한 " + num + "번 게시글이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
