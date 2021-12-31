import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02_FileInputStream {
	
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			// 파일로부터 데이터를 읽어들이는 통로
			in = new FileInputStream("practice/abc.txt");
			
			// read() : 데이터를 한 바이트씩 읽어들인다. 더 이상 읽읅것이 없다면 -1을 반환하다.
//			int data;
//			while ((data = in.read()) != -1) {
//				System.out.print((char)data);
//			}
			
			// readAllBytes(): 한번에 모든 데이터를 byte[]로 읽는다.
//			String allData = new String(in.readAllBytes());
//			System.out.println(allData);
			
			byte[] buffer = new byte[20];			
			
			// 연습 : byte[] 방식으로 모든 파일의 내용을 출력할 수 있는 반복문 작성
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
