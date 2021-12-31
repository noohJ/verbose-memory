package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요.");
		String sentence =sc.next();
		sentence.length();
		
		
		int[] lowerCnt = new int[26];
		int[] upperCnt = new int[26];
		
		char[] stc_aray = sentence. toCharArray();
		
		for (int i = 0; i < sentence.length(); ++i) {
			char ch = stc_aray[i];
			
			if (ch >= 'A' && ch <= 'Z') {
				upperCnt[ch - 'A']++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCnt[ch - 'a']++;
			}
		}
		for (int i = 'A'; i <= 'Z' ; ++i) {
			System.out.printf(" %s의 개수 : %d\n ", ((char)i),upperCnt[i-'A']);
		}
		for (int i = 'a'; i <= 'z' ; ++i) {
			System.out.printf(" %s의 개수 : %d\n ", ((char)i),lowerCnt[i-'a']);
		}
	}
}
