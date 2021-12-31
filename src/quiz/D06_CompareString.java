package quiz;

import java.util.Scanner;

public class D06_CompareString {
	/*
	  	String.compare()를 이용한다면 두 영단어의 크기를 쉽게 비교할 수 있다.
	  	
	  	두 단어를 전달하면 어떤 단어가 사전상으로 먼저 등장하는지 알려주는 메서드를
	  	
	  	CompareTo()를 사용하지 말고 구현하세요.
	  
	 */
	public static int order(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int shorter;
		int len_a= a.length(), len_b=b.length();
		
		if (len_a < len_b) {
			shorter = len_a;
		} else {
			shorter = len_b;
		}
				
		for (int i = 0; i < shorter; ++i) {
			char ch_a = a.charAt(i);
			char ch_b = b.charAt(i);
			
			if (ch_a != ch_b) {
				return ch_a -ch_b;
			}
		}
			
		if (len_a == len_b) {
			return 0;
		}else if (len_a >len_b){
			return a.charAt(shorter)-'a';
		}else {
			return (a.charAt(shorter)-'a')*-1;
		}
	}
	public static void main(String[] args) {
		System.out.println(order("cat","cap"));
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("비교할 단어를 입력하세요 > ");
//		String word1 = sc.next();
//		String word2 = sc.next();
//		
//		int len = word1.length();
//		if (len > word2.length()) {
//			len = word2.length();
//		}
//		for (int i = 0; i < len;++i) {
//			int a = 0;
//			int b = 0;
//			
//			if (word1.charAt(i)>='a' && word1.charAt(i)<='z') {
//				 a = word1.charAt(i)-'a';
//			} else if (word1.charAt(i)>='A' && word1.charAt(i)<='Z') {
//				 a = word1.charAt(i)-'A';
//			}
//			
//			if (word2.charAt(i)>='a' && word2.charAt(i)<='z') {
//				 b = word2.charAt(i)-'a';
//			} else if (word2.charAt(i)>='A' && word2.charAt(i)<='Z') {
//				 b = word2.charAt(i)-'A';
//			}
//			
//			if (a > b) {
//				System.out.println(word1+" 단어가 "+word2+" 단어보다 "+(a-b)+" 만큼 큽니다.");
//				break;
//			}else if (b > a){
//				System.out.println(word2+" 단어가 "+word1+" 단어보다 "+(b-a)+" 만큼 큽니다.");
//				break;
//			}else {
//				continue;
//			}
//		}

		
	}
}
