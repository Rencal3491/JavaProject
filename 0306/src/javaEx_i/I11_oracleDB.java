package javaEx_i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class I11_oracleDB {
	//JAVA에 DB연동하기(Oracle)
	   // 1. Driver Loading
	   // 2. DriverManger을 이용하여 Connection 객체 생성
	   // 3. SQL 작성(preparedstatement방식은 SQL을 먼저 작성해야 함)
	   // 4. PreparedStatement 객체 사용(Statement 객체 대용)
	   // 5. SQL실행
	   
	   // 왜? PreparedStatement를 사용할까? 
	   // - SQL에 전달하여 처리하는 값을 변환하는 것이 Statement 까다롭다는 점. 
	   // - PreparedStatement는 이것을 간결하게 할 수 있게 작업해줌.
	   // - 간단하게 값을 전달할 때에 SQL에 ?로 처리하여 값을 지정하고, 변환 처리는 자동으로
	   // - ?는 인덱스 값을 사용하여 참조하기 때문에 여러개인경우 1번부터 순서대로 지정!
	public static void main(String[] args) {
		//Oracle preparedStatement
		//1. Driver loding
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:11521/XEPDB1";
		String user = "spring";
		String password = "spring";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1 드라이버 로드
			Class.forName(driver);
			//2 커넥션 객체 생성
			conn = DriverManager.getConnection(url,user,password);
			//3 sql 작성
			String sql =  "insert into persons (id,lastname,firstname,age)"
					+ "values(?,?,?,?)";
			//4 preparedStatment 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,100);
			pstmt.setString(2, "testuser111");
			pstmt.setString(3, "testFirstuser111");
			pstmt.setInt(4,25);
			//5 sql 실행
			int res = pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("레코드 추가 성공");
			} else {
				System.out.println("레코드 추가 실패");
			}
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("sql 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs!=null)rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
