package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;

public class J05_PrintAllColumns {
	// employees의 모든 컬럼 내용을 콘솔에 출력해보세요
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees";
		
		try (
			Connection conn= DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			ResultSetMetaData meta = rs.getMetaData();
			int columnSize = meta.getColumnCount();
			
			for (int col = 1; col <= columnSize; ++col) {
				int w = meta.getColumnDisplaySize(col);
				System.out.printf("%"+w+"s", meta.getColumnLabel(col));
			}
			System.out.println("");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			while(rs.next()) {
				
				for(int col = 1; col <= columnSize;++col) {
					int w = meta.getColumnDisplaySize(col);
					if (rs.getString(col) != null) {
						if (w < rs.getString(col).length()) {
							w = rs.getString(col).length();
						}
					}
					System.out.printf("%"+w+"s ",rs.getString(col));					
				}
				System.out.println("");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		try (
//			Connection conn = DBConnector.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//			ResultSet rs = pstmt.executeQuery();
//		){
//			ResultSetMetaData meta = rs.getMetaData();
//			int ColSize = meta.getColumnCount();
//	
//			Column[] cols = new Column[ColSize];
//			
//			for (int i = 0 ; i<ColSize ; ++i) {
//				cols[i] = new Column(meta.getColumnName(i+1));			
//			}
//			
//			while (rs.next()) {				
//				for (int i = 0 ; i < ColSize; ++i) {
//					cols[i].content.add(rs.getObject(i+1));
//				}
//			}
//			
//			// 알맞은 displaySize 계산
//			for (int i = 0; 1< ColSize; ++i) {
//				
//			}
//			
//			
//			int rowSize = cols[0].content.size()+1;
//			
//			for (int i = 0; i < rowSize; ++i) {
//				for(int j = 0; j<cols.length; ++j) {
//					if (i ==0) {
//						System.out.printf("%-"+cols[j].columnDisplaySize + "s|",cols[j].columName);
//					} else if(i ==1) {
//						for (int cds = 0; cds <=cols[j].columnDisplaySize;++cds) {
//							if (cds == cols[j].columnDisplaySize) {
//								System.out.print("┼");
//							}else {
//								System.out.print("─");
//							}
//						}
//					} else {
//						System.out.printf("%-"+cols[j].columnDisplaySize + "s|",cols[j].content);
//					}
//				}
//				System.out.println();
//			}
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
//class Column {
//	String columName;
//	ArrayList<Object> content;
//	Integer columnDisplaySize;
//	
//	public Column(String columnName) {
//		this.columName = columnName;
//		this.content = new ArrayList<>();
//	}
//	
//	public void update() {
//		int rowSize = content.size();
//		for (int i = 0; i < rowSize; ++i ) {
//			int len =  String.format("%s",content.get(i)).length();
//			columnDisplaySize = columnDisplaySize < len ? len :columnDisplaySize;
//		}
//		int len = columName.length();
//		columnDisplaySize = columnDisplaySize < len ? len : columnDisplaySize; 
//	}
}
