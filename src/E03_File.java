import java.io.File;
import java.io.IOException;

public class E03_File {

	/*
	  	# java.io.File
	  
	  	 - ���� �ý��ۿ� ����� �� ���� �Ǵ� ���丮�� ������ ���� Ŭ����
	  	 - �ν��Ͻ��� ����ִ� ������ �������� �̹� �����ϴ� ������ ������ �� �ִ�.
	  	 - ���ο� �ν��Ͻ��� �����Ͽ� ���ο� ���� �Ǵ� ���丮�� ���� �ý��ۿ� �߰��� ���� �ִ�.
	 */
	public static void main(String[] args) {
		File f1 = new File("Record/record.txt");
		File f2 = new File("exercise/day01/quiz03");
		
		// exists() : �ش� ��ο� ���� �Ǵ� ���丮�� �����ϴ��� �˻�
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		
		// canXXX() : ���� Ȯ��
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		// delete() : ���� ����
//		f1.delete();
		
		// mkdir() : �ش� ��ο� ���丮 ����
		// mkdirs() : �ش� ��λ��� ��� ���丮���� ����
		// createNewFile() : �ش� ��ο� ���� ����
		if(!f1.exists()) {
			f1.mkdirs();
		}
		
		// isDirectory(): �ش� ����� ������ ���丮���� �˻�
		System.out.println(f1 + "�� ���丮�ΰ���? "+f1.isDirectory());
		System.out.println(f1 + "�� �����ΰ���? "+f1.isFile());
	}
}
