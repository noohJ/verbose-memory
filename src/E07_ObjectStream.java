import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E07_ObjectStream {
	/*
	  	# ObjectOutputStream, ObjectInputStream
	  	
	  	 - ������ ������ (�ν��Ͻ�)���� ������ �� �ִ� ��Ʈ��
	  	 - Serializable �������̽��� �����Ǿ� �ִ� Ŭ������ �ν��Ͻ��� ������ �� �ִ�.
	  	 
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
		System.out.println("�� �������ϴ�.");
	}
}

