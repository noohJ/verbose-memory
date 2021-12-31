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
		
		// INSERT, UPDATE, DELETE �� executeUpdate()�޼��带 ����Ѵ�.
		String sql = "UPDATE fruits6 SET fsize=fsize+1 WHERE fsize != 20";
		
		try (
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// INSERT, UPDATE, DELETE�� ResultSet ��� �� ���� �ٲ�������� �����Ѵ�.
			int rows= pstmt.executeUpdate();
			
			System.out.printf("%d���� ����Ǿ����ϴ�.\n",rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
