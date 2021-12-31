import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E05_BufferedStream {
	
	/*
	  	# Buffered
	  
	  	 - �����͸� �Ѱ��� ������ �����ϴ� �ͺ��� �߰��� ���۸� �ΰ� �ѹ��� �����ϴ°��� �ξ� ȿ�����̴�.
	  	 - ���� ����� �̸� ������ Ŭ�������� �տ� Buffered��� �̸��� �پ� �ִ�.
	  	 - ex : BufferedInputStream, BufferedReader ...
	 */
	static File f = new File("practice/frankenstein.txt");
	
//	public static void read1() {
//		try (FileReader in =new FileReader(f);){
//			int ch;
//			try {
//				while((ch= in.read()) !=-1) {
//					System.out.println((char)ch);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//		
//			e.printStackTrace();
//		}
//	}
	public static void read2() {
		try (FileReader in = new FileReader(f);){
			char[] buffer = new char[99999];
			while(in.read(buffer) != -1) {
				System.out.println(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void read3() {
		try(
				BufferedReader in = new BufferedReader(new FileReader(f), 8192);
		){
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		read3();
		long end = System.currentTimeMillis();
		
		System.out.println("read3�� �ɸ� �ð�: "+(end - start)+"ms");
	}
}
