import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E08_printStream {
	
	/*
	  	# PrintStream, PrintWriter
	   
	   	 - �����͵��� �� ���ϰ� ����� �� �ִ� Ŭ����
	   	 - printf(), println() ���� ��� �޼������ �����Ǿ� �ֵ�.
	 */
	
	public static void main(String[] args) {
		
		File f = new File("practice/print.txt");
		
		try(
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, Charset.forName("EUC-KR"))));
		) {
			out.println("Hello, PrintWriter!!");
			out.printf("�̸�: %s\n","ȫ�浿");
			out.printf("����: %d\n",25);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2 = new File("practice/printstream.txt");
		
		try (
				PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream(f2)));
		) {
			out.println("Hello, PrintStream!!");
			out.print("�ѱ� ����?");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
