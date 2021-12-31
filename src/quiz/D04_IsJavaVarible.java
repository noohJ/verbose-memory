package quiz;

import java.util.Scanner;

public class D04_IsJavaVarible {
	
	public static boolean isVariable(String word) {
		char[] arr = word.toCharArray();
		
		for (int i = 0; i < arr.length;++i) {
			System.out.println("\""+word+"\"을 검사중입니다.");
			if (i == 0 && Character.isDigit(arr[i])) {
				System.out.println("첫 글자가 숫자입니다!");
				return false;				
			} else if (!Character.isJavaIdentifierPart(arr[i])) {
				System.out.println("고생할 필요가 없는 문제였습니다.");
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 변수를 입력하세요 > ");
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
			System.out.println("사용 가능한 변수 입니다.");
		} else if (chk ==false) {
			System.out.println("사용 불가능한 변수 입니다.");
		}
		
	}


}
