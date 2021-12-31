package quiz;

import java.util.Scanner;

public class D04_IsJavaVarible {
	
	public static boolean isVariable(String word) {
		char[] arr = word.toCharArray();
		
		for (int i = 0; i < arr.length;++i) {
			System.out.println("\""+word+"\"�� �˻����Դϴ�.");
			if (i == 0 && Character.isDigit(arr[i])) {
				System.out.println("ù ���ڰ� �����Դϴ�!");
				return false;				
			} else if (!Character.isJavaIdentifierPart(arr[i])) {
				System.out.println("����� �ʿ䰡 ���� ���������ϴ�.");
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ��� > ");
		String varible = sc.nextLine();
		
		boolean chk = true;
		for (int i = 0; i < varible.length();++i) {
			if (Character.isDigit(varible.charAt(0))) {
				chk = false;
				break;
			} else if (Character.isAlphabetic(varible.charAt(i))) {
				continue;
			} else if(Character.isSpaceChar(varible.charAt(i))){
				chk = false;
				break;
			} else if (varible.charAt(i) == '$' || varible.charAt(i) =='_') {
				continue;
			} else {
				chk = false;
			}
		}
		if (chk == true) {
			System.out.println("��� ������ ���� �Դϴ�.");
		} else if (chk ==false) {
			System.out.println("��� �Ұ����� ���� �Դϴ�.");
		}
		
	}


}
