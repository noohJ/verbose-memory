package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class J06_DataModelClass {
	
	public static void main(String[] args) {
		String fruit = "SELECT * FROM fruits6";
		String origin = "SELECT * FROM origins";
		// DB에서 꺼내온 데이터는 데이터 모델 클래스에 넣어두는 것이 좋다.
		ArrayList<Fruit> fruits = new ArrayList<>();
		// 연습 ArrayList fruits를 채워보세요.
//		System.out.println(fruits);
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement fruitt = conn.prepareCall(fruit);
			ResultSet frq = fruitt.executeQuery();
			PreparedStatement origint = conn.prepareCall(origin);
			ResultSet orq = origint.executeQuery();
		){
			ResultSetMetaData meta = frq.getMetaData();
			ResultSetMetaData meta2 = orq.getMetaData();
			int size = meta.getColumnCount();
			while(frq.next()) {
				fruits.add(new Fruit(frq.getString(1),frq.getString(2),frq.getString(3),frq.getString(4),frq.getString(5)));
			}
			System.out.println(fruits);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}

// Data Model
class Fruit {
	String fid;
	String fname;
	String grade;
	String fsize;
	String code;
	Origin orign;
	
	public Fruit(String fid,String fname,String grade,String fsize,String code){
		this.fid = fid;
		this.fname = fname;
		this.grade = grade;
		this.fsize = fsize;
		this.code = code;
	}
	public String toString() {
		return String.format("[%s/%s/%s/%s/%s]", fid,fname,grade,fsize,code);
	}
	
}

class Origin{
	String code;
	String kor_name;
	String eng_name;
	String weather;
	public Origin(String code,String kor_name,String eng_name,String weather) {
		this.code = code;
		this.kor_name = kor_name;
		this.eng_name = eng_name;
		this.weather = weather;
	}
	public String toString() {
		return String.format("[%s/%s/%s/%s/%s]", code,kor_name,eng_name,weather,code);
	}
}