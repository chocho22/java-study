package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class View2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("=================================================");
			System.out.println(" 환영합니다. ");
			System.out.println(" 아래에서 아이디를 입력해보아요. ");
			System.out.println("=================================================");

			System.out.print("아이디 : ");
			String id = scan.nextLine();
			if ("osfu".equals(id)) {
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				if ("12345678".equals(pwd)) {
					do {
						System.out.println("환영합니다. osfu님! 서비스를 맘껏 이용하세요.");
						System.out.println("1. 게시물 등록");
						System.out.println("2. 게시물 삭제");
						System.out.println("3. 게시물 조회");
						System.out.println("4. 게시물 수정");
						System.out.println("q. 종료");
						System.out.println("원하시는 번호를 눌러주세요.");
						System.out.print("번호 : ");
						cmd = scan.nextLine();

						String url = "jdbc:oracle:thin:@localhost:1521:xe";
						Connection con = null;
						if ("1".equals(cmd)) {
							try {
								con = DriverManager.getConnection(url, id, pwd);
								String sql = "insert into board_info";
								sql += "(bi_num,bi_title,bi_content " + " ,bi_credat,bi_cretim)";
								sql += "values(7,?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MISS'))";
								PreparedStatement ps = con.prepareStatement(sql);
								System.out.println("제목을 입력해주세요. : ");
								String title = scan.nextLine();
								System.out.println("내용을 입력해주세요. : ");
								String content = scan.nextLine();
								ps.setString(1, title);
								ps.setString(2, content);
								System.out.println("입력이 완료되었으면 '완료'라고 입력해주세요.");
								String cpl = scan.nextLine();
								if ("완료".equals(cpl)) {
									int cnt = ps.executeUpdate();
									System.out.println(cnt);
									if (cnt == 1) {
										System.out.println("정상적으로 1개가 입력되었다.");
									} else if (cnt == 0) {
										System.out.println("안들어갔다.");
									} else {
										System.out.println("'완료'라고 입력해주세요.");
									}
								}
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					} while (!"q".equals(cmd));
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("없는 아이디입니다.");
			}
		} while (!"q".equals(cmd));
		System.out.println("바이바이");
	}
}
