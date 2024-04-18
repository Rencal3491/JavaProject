package javaEx_i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class I06_JDBC {

	public static void main(String[] args) {
		//jdbc 연동 테스트
		//db 연결 객체 (connection)
		Connection conn = null;
		//checked exception : SQLException
		try {
			//1. 드라이버 연결
			//mysql 사용 드라이버
			//mysql 6.xx버전 이전 : com.mysql.jdbc.Driver
			//mysql 6.xx버전 이후 : com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connection 객체 생성 - 드라이버 매니저
			//mysql 6.xx버전 이전 : jdbc:mysql://호스트이름:포트번호/db이름
			//mysql 6.xx버전 이후 : jdbc:mysql://호스트이름:포트번호/db이름?serverTimezone=Asia?Seoul
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println("db 접속 성공");
			//insert update delete excuteUpdate()-반환 타입이 int
			//3. Statement 객체 생성	createStatement()
			Statement stmt = conn.createStatement();
			//4. sql작성
//			String sql1 = "insert into Persons (firstname, lastname,age, city)"
//					+ " values ('jdbcTest', 'testuser13',24,'Seoul')";
//			String sql2 = "update persons set firstname ='순신', lastname = '이 '" +
//					"where id = 16";
			String sql3 = "delete from persons where id = 17" ;
			//5. Statement 객체를 통해 작성된 sql문을 실행
			int res =  stmt.executeUpdate(sql3);
			//성공시 1 실패시 0
			if(res !=0) {
				System.out.println("sql 성공");
			} else {
				System.out.println("sql 실패");
			}
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("sql연동 오류");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
