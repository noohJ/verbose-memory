import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E07_ObjectStream {
	/*
	  	# ObjectOutputStream, ObjectInputStream
	  	
	  	 - 참조형 데이터 (인스턴스)들을 전송할 수 있는 스트림
	  	 - Serializable 인터페이스가 구현되어 있는 클래스의 인스턴스만 전송할 수 있다.
	  	 
	 */
	public static void main(String[] args) {
		
		File f = new File("practice/object.txt");
		
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		){
			Apple a = new Apple();
			a.size = 3136;
			out.writeObject(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("잘 써졌습니다.");
	}
}

