package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String user = "HR";
	private static String password = "1234";
	
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		// INSERT, UPDATE, DELETE 는 executeUpdate()메서드를 사용한다.
		String sql = "UPDATE fruits6 SET fsize=fsize+1 WHERE fsize != 20";
		
		try (
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// INSERT, UPDATE, DELETE는 ResultSet 대신 몇 행이 바뀌었는지를 리턴한다.
			int rows= pstmt.executeUpdate();
			
			System.out.printf("%d행이 변경되었습니다.\n",rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
