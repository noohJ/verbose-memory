import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
		/*
		  	# Java I/O (INput/Output)
		  	
		  	 - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다.
		  	 - 프로그램으로 들어오는 모든 데이터들은 입력이라 부른다 (Input)
		  	 - 프로그램에서 계산되어 나가는 데이터들은 출력이라고 부른다.(Output)		  	 
		  	 
		  	# Stream
		  	
		  	 - 데이터들이 오가는 통로
		  	 - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다.
		  	 - 데이터들이 프로그램에서 목적지로 나가는 통로를 OutputStream이라고 부른다
		  	 - 데이터를 Stream을 통해 전송하기 위해서는 데이터를 byte타입으로 변환시켜야 한단.
		  	 
		 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("practice/abc.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			
			// String.getBytes() : 뭔자열을 전송하기 위해 byte[]로 변환하는 메서드
			out.write("\n\n안녕하세요 반갑습니다.\n".getBytes());
			out.write(48);
			out.write(49);
			out.write(50);
			out.write(51);
			out.write(52);
			
			// 다 쓴 통로는 반드시 닫아줘야 한다.
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾았습니다.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("파일 쓰기중에 문제 발생.");
			System.exit(0);
		}
		System.out.println("쓰기 완료.");
	}
}
