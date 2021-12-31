package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	/*
	 	# JDBC
	 
	 	 - Java DAtabase Connectivitty.
	 	 - DB에 쿼리문을 전달해 실행하고 결과를 받아오는 Java API
	 	 - 다양한 종류의 DB와 연결될 수 있도록 설계되어 있다.
	 	 - Java 소스 코드는 어떤 DB와 연결하더라도 항상 일정하다.
	 	 
	 	# OJDBC
	 	
	 	 - 오라클 데이터베이스가 JDBC API와 소통하기 위해 만들어놓은 라이브러리
	 	 - 오라클 DB가 설치된 폴더 내부에 포함되어 있다.
	 */
	public static void main(String[] args) {
		//1. Class.forName()으로 jdbc 드라이버를 로드한다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. DriverManager 클래스를 통해 DB에 연결한다.
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",
					"hr",
					"1234");
			System.out.println("연결 생성 완료.");
			
			// 3. 생성된 연결을 통해 원하는 쿼리문을 전달한다.(;은 생략)
			
			// 3-1 구문 준비하기
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 3-2 준비한 구문 실행 후 결과 받아오기
			ResultSet rs = pstmt.executeQuery();
			
			// 4. 받아온 쿼리 결과를 마음껏 사용한다.
			while (rs.next()){
				System.out.printf("%d\t%s\t%s\t%f.2\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("job_id"),
						rs.getDouble("salary"));
			}
			
			// 5 . 다 사용한 연결은 반드시 닫아야 한다. 늦게 생성한 순서대로 객체를 당아준다.
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
