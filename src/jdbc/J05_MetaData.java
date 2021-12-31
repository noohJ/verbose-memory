package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_MetaData {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try(
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			// MEtaData : �ش� ���� ���� ����� ���� ������ ����ִ� ������
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("���� ���� ����� �÷� ���� :"+meta.getColumnCount());
			
			int columnSize = meta.getColumnCount();
			
			for (int col = 1;col <= columnSize; ++col) {
				System.out.printf("%d��° �÷��� �̸�: %s\n", col, meta.getColumnLabel(col));
				System.out.printf("DisplaySize[%d] : %d\n", col, meta.getColumnDisplaySize(col));				
				System.out.println("-----------------------------------------");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
