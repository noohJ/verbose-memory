package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean chk =true;
		while(chk) {
			try {
				System.out.println("���ڸ� �Է��ϼ���");
				int num = sc.nextInt();
				System.out.println("�Է��� ���ڴ� : "+num);		
				break;
			} catch(InputMismatchException e){
				System.out.println("���ڸ� �Է��ϼ���.");
				System.out.println("��ĳ�ʿ� �ɷ��ִ� ��: " + sc.next());
			}
		}
	}
}
