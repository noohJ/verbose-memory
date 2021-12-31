

import java.io.FileNotFoundException;
import java.io.IOException;

public class C14_Throw {
	/*
	  	# throw
	  	
	  	 - ��� ���ϴ� ���ܸ� �߻���Ų��.
	  	 
	  	# throws
	  	
	  	 - �ش� �޼��忡�� �߻��ϴ� ���ܿ� ���� ó���� �޼��带 ȣ���� ������ �̷� �� �ִ�.
	  	 
	  	# �� ó������ �ʾƵ� �Ǵ� ���� 
	  	
	  	 - RuntimeException Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó������ �ʾƵ� ���. 
	  	 - ���� ó���� ���� �ʾƵ� ������ ����(������)�� �߻����� �ʴ´�.
	  	 
	  	# �ʼ��� ó���ؾ� �ϴ� ����
	  	
	  	 - Exception Ŭ������ ��ӹ��� ���ܵ��� ó������ ������ �������� �Ұ����ϴ�.
	  	 - ���򰡿����� �ݵ�� try- catch�� ó���Ǿ�� �������� ������ �� �ִ�.
	 */
	public static int awesomeMethod2() throws FileNotFoundException, IOException {
		switch ((int)(Math.random()*10)) {
			case 0:
				return 0;
			case 1:
				throw new FileNotFoundException("1�� ���Գ׿�");
			case 2:
				throw new IOException("2�� ���Գ׿�");
			default:
				throw new IllegalArgumentException();
		}
	}
	
	public static int awesomeMethod(){
		try {
			switch ((int)(Math.random()*10)) {
			case 0:
				return 0;
			case 1:
				throw new FileNotFoundException("1�� ���Գ׿�");
			case 2:
				throw new IOException("2�� ���Գ׿�");
			default:
				throw new IllegalArgumentException();
			}			
		} catch(FileNotFoundException e) {
			return -1;
		}catch(IOException e) {
			return -2;
		}
	}

	
	public static void main(String[] args) {
		
	}
}
