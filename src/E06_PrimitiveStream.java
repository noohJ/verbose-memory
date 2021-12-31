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
	  
	  	 - �⺻�� Ÿ���� �ս��� ��Ʈ������ �����ϱ� ���� Ŭ����
	  	 - Java�� �⺻�� Ÿ���̱� ������ Java �̿��� ���α׷��� ������ �ش� ������ Ȱ���� �� ����.
	  	 - �����͸� �ݵ�� �־��� ������� ������ �Ѵ�. 
	  	 
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
			out.writeUTF("�ȳ��ϼ���?");
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
