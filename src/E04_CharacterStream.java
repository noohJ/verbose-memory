import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E04_CharacterStream {
	
	/*
	  	#InputStream/OutputStream
	  	
	  	 - byte단위로 데이터를 전송
	  	 
	  	# Reader/Writer
	  
	  	 - char단위로 데이터를 전송
	  	 - 2바이트 이상의 데이터를 전송할떄는 어떤 문자셋을 사용할지 정해야 한다.
	  	
	  	# Charset
	  	
	  	 - ASCII코드 까지는 모든 문자셋이 동일하지만 그 이후의 문자 코드는 각 회사가 독자적으로 만들었따.
	  	 - MS949  : 마이크로소프트의 문자셋
	  	 - EUC-KR : 이클립스가 좋아하는 문자셋 
	  	 - UTF-8  : 가장 표준이 되는 문자셋
	 */
	public static void main(String[] args) {
		
		File testFile = new File("practice/ccharacter.txt");
		
		try(
				FileWriter out = new FileWriter(testFile,Charset.forName("UTF-8"));
		) {
			// append(): 추가할 데이터를 모아놓는다
//			for(int i = 0; i<10;++i) {
//				out.append("Hello, world!\n\n");
//				out.append(" /)/)\n");
//				out.append("(  ..)\n");
//				out.append("(  >♡\n");
//				out.append("안녕, 세상아!\n\n");
//				
//			}
			
			// flush(): 추가된 데이터들을 한번에 파일로 내보낸다. close()시에 자동으로 flush()가 실행된다..
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
