package javaEx_i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {

	public static void main(String[] args) {
		/*
		 * DAO클래스
		 * 데이터베이스에 접속해서 데이터의 CRUD등의 작업을 하는 클래스
		 * 일반적으로 다른 프로그램 로직 위에서 동작하기도 하지만 별도의 DAO클래스를 만들어 사용하기도 함
		 * ->유지보수 및 코드의 모듈화를 위해
		 * 보통 한개의 테이블마다 한개의 DAO작성
		 * DAO클래스는 데이블로부터 데이터를 읽어서 자바 객체로 변환하거나
		 * 자바 객체의 값을 테이블에 저장
		 * 때문에 DAO를 구현하면 테이블의 컬럼과 매핑되는 값을 가지고 있는 클래스를 항상 작성해야함
		 * 이 클래스를 VO클래스라고 한다.
		 * 
		 * 멤버변수 - 필드 속성
		 * Connecttion 객체를 생성하기 위한 값
		 * 
		 */
	}		
//	private String url = "jdbc:mysql://localhost:3306/testdb";
	private String url = "jdbc:mariadb://localhost:13306/testdb";
	private String user = "root";
	private String password = "root1234";
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
//			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("DB 연동 성공");
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
			
		} catch (SQLException sqle) {
			// TODO: handle exception
			System.out.println("sql 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}
	//CRUD 메소드 구현
	//1 데이터 입력 메소드
	public int insert(PersonsVo vo) {
		int res=0;
		String sql = "insert into Persons (lastname, firstname, age, city)"
				+ "values('"+vo.getLastname()+"','"+vo.getFirstname()+"',"
				+vo.getAge()+", '"+vo.getCity()+"')";
		try {
			//Statemnet객체 생성
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 에러");
			System.out.println(sqle.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return res;
	}
	//2 정보 출력 메소드
	public List<PersonsVo> allPersons() {
		List<PersonsVo> list = new ArrayList<>();
		String sql = "select * from Persons order by id desc";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id =  rs.getInt("id");
				String lastName = rs.getString("lastname");
				String firstName = rs.getString("firstname");
				int age =  rs.getInt("age");
				String city =  rs.getString("city");
				PersonsVo vo = new PersonsVo(id,age,lastName,firstName, city);
				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("sql 연동 실패");
		} finally {
			try {
				if(stmt!= null) stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return list;
	}	//id입력값을 통한 정보 출력
	public PersonsVo selectOne(int id) {
		PersonsVo vo = null;
		
		String sql = "select * from persons where id =" + id;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
					if(rs.next()) {
						vo = new PersonsVo();
						vo.setId(rs.getInt("id"));
						vo.setLastname(rs.getString("lastname"));
						vo.setFirstname(rs.getString("firstname"));
						vo.setAge(rs.getInt("age"));
						vo.setCity(rs.getString("city"));
					}else {
						System.out.println("찾는 DB가 없습니다.");
					}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실");
			System.out.println(e.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(rs !=null) rs.close();
			} catch (Exception e2) {}
		}
		
		
		return vo;
	}
	public int updatePersons(PersonsVo vo) {
		int res =0;
		String sql = "update persons set firstname = '" + vo.getFirstname() + "', "
				+"lastname = '" +vo.getLastname()+ "' , age = " + vo.getAge() +
				",city = '" + vo.getCity() + "' where id = " + vo.getId();
		try {
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("sql 연동 실패");
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}
	public int deletePersons(int id) {
		int res = 0;
		String sql = "delete from persons where id =" + id;
		
		try {
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("sql 연동 실패");
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	}
}
