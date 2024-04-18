package javaEx_i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; // Scanner 클래스 import

public class I07_JDBC2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root1234");
            System.out.println("db연동됨");
            stmt = conn.createStatement();

            System.out.print("검색 방법을 선택하세요 (1: id, 2: 이름): ");
            int consoleNum = scanner.nextInt(); // 사용자 입력 받기

            if (consoleNum == 1) {
                System.out.print("id 값을 입력하세요: ");
                int id = scanner.nextInt();
                String sql = "SELECT * FROM persons WHERE id = " + id;
                rs = stmt.executeQuery(sql);

                if (!rs.next()) {
                    System.out.println("결과가 없습니다.");
                } else {
                    do {
                        int personId = rs.getInt("id");
                        String firstName = rs.getString("firstname");
                        String lastName = rs.getString("lastname");
                        int age = rs.getInt("age");
                        String city = rs.getString("city");
                        System.out.printf("id: %d, 성: %s, 이름: %s, 나이: %d, 도시: %s\n", 
                        		personId, firstName, lastName, age, city);
                    } while (rs.next());
                }
            } else if (consoleNum == 2) {
                System.out.print("이름의 일부를 입력하세요: ");
                String insertName = scanner.next();
                String sql = "select * from persons where firstname like '%" 
                + insertName + "%' or lastname like '%" + insertName + "%'";
                rs = stmt.executeQuery(sql);

                if (!rs.next()) {
                    System.out.println("결과가 없습니다.");
                } else {
                    do {
                        int personId = rs.getInt("id");
                        String firstName = rs.getString("firstname");
                        String lastName = rs.getString("lastname");
                        int age = rs.getInt("age");
                        String city = rs.getString("city");
                        System.out.printf("id: %d, 성: %s, 이름: %s, 나이: %d, 도시: %s\n", 
                        		personId, firstName, lastName, age, city);
                    } while (rs.next());
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }

        } catch (ClassNotFoundException ce) {
            System.out.println("드라이버 연동 실패");
        } catch (SQLException sqle) {
            System.out.println("SQL 연동 실패");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                if (conn != null) conn.close();
                if (stmt != null) stmt.close();
                if (rs != null) rs.close();
                scanner.close(); // Scanner 객체 닫기
            } catch (Exception e) {
                // 예외 처리
            }
        }
    }
}