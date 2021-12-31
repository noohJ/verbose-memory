package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class J06_DataModelClass2 {
	
	public static void main(String[] args) {
		// DB에서 꺼내온 데이터는 데이터 모델 클래스에 넣어두는 것이 좋다.
		ArrayList<Fruit> fruits = new ArrayList<>();
		// 연습 ArrayList fruits를 채워보세요.
//		System.out.println(fruits);
		String sql = "SELECT * FROM fruits6 INNER JOIN origins USING (code)";
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				fruits.add(new Fruit(rs));
			}
			
			System.out.println(fruits);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}

// Data Model
class Fruit {
	Integer fid;
	String fname;
	String grade;
	Integer fsize;
	String code;
	Origin origin;
	
	public Fruit(ResultSet rs) throws SQLException{
		fid = rs.getInt("fid");
		fname= rs.getString("fname");
		grade = rs.getString("grade");
		fsize = rs.getInt("fsize");
		code = rs.getString("code");
		origin = new Origin(rs);
	}
	public String toString() {
		return String.format("[%s/%s/%s/%s/%s/%s/%s/%s]", fid,fname,grade,fsize,code,code);
	}
	
}

class Origin{
	Integer code;
	String kor_name;
	String eng_name;
	Integer weather;
	
	public Origin(ResultSet rs) throws SQLException {
		code = rs.getInt("code");
		kor_name = rs.getString("kor_name");
		eng_name = rs.getString("eng_name");
		weather = rs.getInt("weather");
		
		
	}
}