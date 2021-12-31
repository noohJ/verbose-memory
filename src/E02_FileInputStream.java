import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02_FileInputStream {
	
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			// ���Ϸκ��� �����͸� �о���̴� ���
			in = new FileInputStream("practice/abc.txt");
			
			// read() : �����͸� �� ����Ʈ�� �о���δ�. �� �̻� �П����� ���ٸ� -1�� ��ȯ�ϴ�.
//			int data;
//			while ((data = in.read()) != -1) {
//				System.out.print((char)data);
//			}
			
			// readAllBytes(): �ѹ��� ��� �����͸� byte[]�� �д´�.
//			String allData = new String(in.readAllBytes());
//			System.out.println(allData);
			
			byte[] buffer = new byte[20];			
			
			// ���� : byte[] ������� ��� ������ ������ ����� �� �ִ� �ݺ��� �ۼ�
			int len;
			while((len = in.read(buffer)) != -1) {
				System.out.print(new String(buffer,0,len));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
