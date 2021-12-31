package quiz;

import java.util.Scanner;

public class D06_CompareString {
	/*
	  	String.compare()�� �̿��Ѵٸ� �� ���ܾ��� ũ�⸦ ���� ���� �� �ִ�.
	  	
	  	�� �ܾ �����ϸ� � �ܾ ���������� ���� �����ϴ��� �˷��ִ� �޼��带
	  	
	  	CompareTo()�� ������� ���� �����ϼ���.
	  
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
//		System.out.println("���� �ܾ �Է��ϼ��� > ");
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
//				System.out.println(word1+" �ܾ "+word2+" �ܾ�� "+(a-b)+" ��ŭ Ů�ϴ�.");
//				break;
//			}else if (b > a){
//				System.out.println(word2+" �ܾ "+word1+" �ܾ�� "+(b-a)+" ��ŭ Ů�ϴ�.");
//				break;
//			}else {
//				continue;
//			}
//		}

		
	}
}
