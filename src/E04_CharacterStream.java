import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E04_CharacterStream {
	
	/*
	  	#InputStream/OutputStream
	  	
	  	 - byte������ �����͸� ����
	  	 
	  	# Reader/Writer
	  
	  	 - char������ �����͸� ����
	  	 - 2����Ʈ �̻��� �����͸� �����ҋ��� � ���ڼ��� ������� ���ؾ� �Ѵ�.
	  	
	  	# Charset
	  	
	  	 - ASCII�ڵ� ������ ��� ���ڼ��� ���������� �� ������ ���� �ڵ�� �� ȸ�簡 ���������� �������.
	  	 - MS949  : ����ũ�μ���Ʈ�� ���ڼ�
	  	 - EUC-KR : ��Ŭ������ �����ϴ� ���ڼ� 
	  	 - UTF-8  : ���� ǥ���� �Ǵ� ���ڼ�
	 */
	public static void main(String[] args) {
		
		File testFile = new File("practice/ccharacter.txt");
		
		try(
				FileWriter out = new FileWriter(testFile,Charset.forName("UTF-8"));
		) {
			// append(): �߰��� �����͸� ��Ƴ��´�
//			for(int i = 0; i<10;++i) {
//				out.append("Hello, world!\n\n");
//				out.append(" /)/)\n");
//				out.append("(  ..)\n");
//				out.append("(  >��\n");
//				out.append("�ȳ�, �����!\n\n");
//				
//			}
			
			// flush(): �߰��� �����͵��� �ѹ��� ���Ϸ� ��������. close()�ÿ� �ڵ����� flush()�� ����ȴ�..
//			out.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try(FileReader in = new FileReader(testFile, Charset.forName("UTF-8"));) {
			char[] buffer = new char[20];
				

			while(in.read(buffer) != -1) {
				System.out.print(buffer);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
