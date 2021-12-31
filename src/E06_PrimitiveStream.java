import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_PrimitiveStream {
	/*
	  	# DataOutputStream, DataInputStream
	  
	  	 - 기본형 타입을 손쉽게 스트림을로 전송하기 위한 클래스
	  	 - Java의 기본형 타입이기 때문에 Java 이외의 프로그래밍 언어데서는 해당 파일을 활용할 수 없다.
	  	 - 데이터를 반드시 넣었던 순서대로 꺼내야 한다. 
	  	 
	 */
	
	public static void main(String[] args) {
		File f = new File("practice/prime.txt");
		
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		) {
			out.writeDouble(123.123);
			out.writeChars("Hello!");
			out.writeInt(54321);
			out.writeShort(30000);
			out.writeUTF("안녕하세요?");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(
			DataInputStream in = new DataInputStream(new FileInputStream(f));	
		) {
			System.out.println(in.readDouble());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readChar());
			System.out.println(in.readInt());
			System.out.println(in.readShort());
			System.out.println(in.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
