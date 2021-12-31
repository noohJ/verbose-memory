package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J01_SearchByName {
	/*
	  	����ڷκ��� �̸��� �Է¹����� �ش� �̸��� ���Ե� ��� ����� ��ȸ�غ�����
	  	
	  	1. ��ҹ��� ���о��� ��� �˻��Ǿ�� ��
	  	
	  	2. first_name �� last_name�� ��� �˻��ؾ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",
					"hr",
					"1234");
			System.out.println("�˻��� ����� �Է��ϼ���.");
			String name = sc.next();
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees WHERE LOWER(first_name) LIKE LOWER('%"+name+"%') OR LOWER(last_name) LIKE LOWER('%"+name+"%')");
			
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\t%.2f\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getDouble("salary"));
				
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	public static void search (String keyword) {
//		String sql = String.format("SELECT * FROM employees WHERE"
//				+"lower(first_name) LIKE '%%%s%%' OR lower(last_name) LIKE '%%%s%%'",
//				keyword.toLowerCase(),
//				keyword.toLowerCase());
//		try (Connection conn = DriverManager.getConnection("jtbc:oracle:thin:@localhost:1521:Xe");
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//				){
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					
//					while (rs.next()) {
//						System.out.println(rs.getString("first_name") +"" +rs.getString("last_name"));
//					}
//					
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e){
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		// ��ĳ�ʺ��� �ξ� ����
//		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
//		
//		try {
//			System.out.print("search > ");
//			String keyword = in.readLine();
//			
//			System.out.println("searching keyword ...");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}


