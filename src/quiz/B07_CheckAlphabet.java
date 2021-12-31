package quiz;

import java.util.Scanner;

public class B07_CheckAlphabet {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자를 입력하세요 > ");
//		String world;
//		world = sc.next();
//		int count_1,count_2,count_3;
//		 count_1 = 0;
//		 count_2 = 0;
//		 count_3 = 0;
//		
//		
//		for (int index = 0; index < world.length(); ++index) {
//			char letter = world.charAt(index);
//			if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') ){		
//				System.out.println(true);
//				break;			
//			} 
//			++count_1;
//			continue;
//		}
//		if (count_1 == world.length()) {
//			System.out.println(false);
//		}
//		
//		for (int index = 0; index < world.length(); ++index) {
//			char letter = world.charAt(index);
//			if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))){
//				System.out.println(false);
//				break;
//			} else {
//				++count_2;
//				continue;
//			} 
//			
//		}
//		if (count_2 == world.length()) {
//			System.out.println(true);
//		}
//		
//
//		for (int index = 0; index < world.length(); ++index) {
//			char letter = world.charAt(index);
//			if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == '_' || letter == '$'||(letter >= 48 && letter <= 57 )  ){
//				if (world.charAt(0) >= '0' && world.charAt(0) <= '9') {
//					System.out.print(false);
//					break;
//				}
//				++count_3;
//				continue;
//			} else {
//				System.out.println(false);
//				break;
//			}
//		}
//		if(count_3 == world.length()) {
//			System.out.println(true);
//		}
		System.out.print("아무 단어나 입력 > ");
		String input = new Scanner(System.in).next();
		
		boolean result1 = false, result2 = true, result3 = true;
		
		int len = input.length();
		
		for (int index = 0; index <len; ++index) {
			char ch = input.charAt(index);
			
			if (ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z') {
				result1 = true;
				break;
			}
		}
		
		for (int index = 0; index < len; ++index) {
			char ch = input.charAt(index);
			
			if (!(ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z')) {
				result2 = false;
				break;
			}
		}
		
		for (int index = 0; index < len; ++index) {
			char ch = input.charAt(index);
			
			boolean numeric = false, lowercase = false, uppercase = false, special = false;
			
			if (ch >= '0' && ch <= '9') {
				numeric = true;
			} else if (ch >= 'a' && ch <= 'z') {
				lowercase =true;
			} else if (ch >= 'A' && ch <= 'Z') {
				uppercase = true;
			} else if (ch == '$' || ch =='_') {
				special = true;
			}
			
			if (!(numeric || lowercase || uppercase || special)) {
				result3 = false ;
				break;
			} else {
				if (index == 0 && (ch >= '0' && ch <= '9')) {
					result3 = false;
					break;
				}
			}
				
		}
		System.out.println("알파벳이 하나라도 포함되어 있는가? " +result1);
		System.out.println("알파벳으로만 이루어져 있는가? " +result2);
		System.out.println("허용된 문자만으로 이루어져 있는가? " +result3);
	}

}
