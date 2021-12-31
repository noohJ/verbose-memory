package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatment {
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
		
		// SQL Injection �� �����ϱ� ���� ? �� ���� ä���� �Ѵ�.
		String sql = "SELECT * FROM employees WHERE employee_id > ? AND ?";
		int a = 150, b =180;
		
		try (
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){			
			
			// �� 1���� ù��° ����ǥ��
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					
					System.out.println(id+"\t"+name);
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
