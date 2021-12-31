package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	/*
	 	# JDBC
	 
	 	 - Java DAtabase Connectivitty.
	 	 - DB�� �������� ������ �����ϰ� ����� �޾ƿ��� Java API
	 	 - �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�.
	 	 - Java �ҽ� �ڵ�� � DB�� �����ϴ��� �׻� �����ϴ�.
	 	 
	 	# OJDBC
	 	
	 	 - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯��
	 	 - ����Ŭ DB�� ��ġ�� ���� ���ο� ���ԵǾ� �ִ�.
	 */
	public static void main(String[] args) {
		//1. Class.forName()���� jdbc ����̹��� �ε��Ѵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. DriverManager Ŭ������ ���� DB�� �����Ѵ�.
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",
					"hr",
					"1234");
			System.out.println("���� ���� �Ϸ�.");
			
			// 3. ������ ������ ���� ���ϴ� �������� �����Ѵ�.(;�� ����)
			
			// 3-1 ���� �غ��ϱ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 3-2 �غ��� ���� ���� �� ��� �޾ƿ���
			ResultSet rs = pstmt.executeQuery();
			
			// 4. �޾ƿ� ���� ����� ������ ����Ѵ�.
			while (rs.next()){
				System.out.printf("%d\t%s\t%s\t%f.2\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("job_id"),
						rs.getDouble("salary"));
			}
			
			// 5 . �� ����� ������ �ݵ�� �ݾƾ� �Ѵ�. �ʰ� ������ ������� ��ü�� ����ش�.
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
