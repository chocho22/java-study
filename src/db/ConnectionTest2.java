package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			String sql = "select bi_num, bi_title, bi_content"
					+ " ,bi_credat, bi_cretim, bi_cnt"
					+ " ,bi_isactive from board_info";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList = new ArrayList<>();
			while(rs.next()) {
				HashMap<String,String> row = new HashMap<>();
				String bi_title = rs.getString("bi_title");
				String bi_num = rs.getString("bi_num");
				String bi_content = rs.getString("bi_content");
				String bi_credat = rs.getString("bi_credat");
				String bi_cretim = rs.getString("bi_cretim");
				String bi_cnt = rs.getString("bi_cnt");
				String bi_isactive = rs.getString("bi_isactive");
				
				row.put("bi_num",bi_num);
				row.put("bi_title",bi_title);
				row.put("bi_content",bi_content);
				row.put("bi_credat",bi_credat);
				row.put("bi_cretim",bi_cretim);
				row.put("bi_cnt",bi_cnt);
				row.put("bi_isactive",bi_isactive);
				
				rowList.add(row);
			}
			for(int i=0;i<rowList.size();i++) {
				System.out.println(rowList.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
