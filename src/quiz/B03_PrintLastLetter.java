package quiz;

import java.util.Scanner;

public class B03_PrintLastLetter {
	public static void main (String[] args) {
		System.out.print("거꾸로 출력 > ");
		String str = new Scanner(System.in).nextLine();
		
		int len = str.length();
		
		if (len == 10) {
			System.out.print(str.charAt(9));
			System.out.print(str.charAt(8));
			System.out.print(str.charAt(7));
			System.out.print(str.charAt(6));
			System.out.print(str.charAt(5));
			System.out.print(str.charAt(4));
			System.out.print(str.charAt(3));
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.print(str.charAt(0));
		} else {
			System.out.println("10글자가 아니라서 종료합니다.");
		}
	}
}



