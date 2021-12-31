package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J04_Transaction {
	
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

	
	public static void allFruits(PreparedStatement pstmt)throws SQLException {

		ResultSet rs = pstmt.executeQuery();
		
		System.out.println("-------------------------------");
		System.out.printf("%s\t%-15s%s\n","FID","FNAME","FSIZE");
		System.out.println("-------------------------------");
		while (rs.next()) {
			System.out.printf("%d\t%-15s%d\n", 
					rs.getInt("fid"),
					rs.getString("fname"),
					rs.getInt("fsize"));
		}
		rs.close();
	}
	
	public static void main(String[] args) {
		
		String sql1 = "UPDATE fruits6 SET fsize=fsize-1";
		String sql2 = "SELECT * FROM fruits6";
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);	
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		){
			// AutoCommit을 꺼야 직접 트랙잭션을 관리할 수있다.
			conn.setAutoCommit(false);
			
			allFruits(pstmt2);
			
			pstmt1.executeUpdate();
			
			allFruits(pstmt2);
			
			conn.rollback();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
