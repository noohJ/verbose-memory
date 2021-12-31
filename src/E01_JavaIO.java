import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
		/*
		  	# Java I/O (INput/Output)
		  	
		  	 - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��.
		  	 - ���α׷����� ������ ��� �����͵��� �Է��̶� �θ��� (Input)
		  	 - ���α׷����� ���Ǿ� ������ �����͵��� ����̶�� �θ���.(Output)		  	 
		  	 
		  	# Stream
		  	
		  	 - �����͵��� ������ ���
		  	 - �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���.
		  	 - �����͵��� ���α׷����� �������� ������ ��θ� OutputStream�̶�� �θ���
		  	 - �����͸� Stream�� ���� �����ϱ� ���ؼ��� �����͸� byteŸ������ ��ȯ���Ѿ� �Ѵ�.
		  	 
		 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("practice/abc.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			
			// String.getBytes() : ���ڿ��� �����ϱ� ���� byte[]�� ��ȯ�ϴ� �޼���
			out.write("\n\n�ȳ��ϼ��� �ݰ����ϴ�.\n".getBytes());
			out.write(48);
			out.write(49);
			out.write(50);
			out.write(51);
			out.write(52);
			
			// �� �� ��δ� �ݵ�� �ݾ���� �Ѵ�.
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ��ã�ҽ��ϴ�.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("���� �����߿� ���� �߻�.");
			System.exit(0);
		}
		System.out.println("���� �Ϸ�.");
	}
}
