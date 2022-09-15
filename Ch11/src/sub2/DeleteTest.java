package sub2;
/*
 * 날짜 : 2022/09/15
 * 이름 : 양재영
 * 내용 : JDBC Delete 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		
		//1단계
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
		//3단계
			Statement stmt = conn.createStatement();
		//4단계
		String sql = "DELETE FROM `User1` WHERE `uid` = 'j101';";
				
		stmt.executeUpdate(sql);
		//5단계
		//6단계
				stmt.close();
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
		}


	}

