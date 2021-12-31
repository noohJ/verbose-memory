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
			// MEtaData : 해당 쿼리 실행 결과에 대한 정보를 담고있는 데이터
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("쿼리 실행 결과의 컬럼 개수 :"+meta.getColumnCount());
			
			int columnSize = meta.getColumnCount();
			
			for (int col = 1;col <= columnSize; ++col) {
				System.out.printf("%d번째 컬럼의 이름: %s\n", col, meta.getColumnLabel(col));
				System.out.printf("DisplaySize[%d] : %d\n", col, meta.getColumnDisplaySize(col));				
				System.out.println("-----------------------------------------");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
