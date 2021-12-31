package quiz;

import java.util.Scanner;

public class B01_ConditionQuiz2 {
	public static void main(String[] args) {
//		// 문자끼리 크기 비교해보기
//		// - char 타입 데이터는 실제로 정수값을 지니고 있기 때문에 문자끼리의
//		//   크기 비교가 가능하다
//		System.out.println('A' < 'T');
//		System.out.println('가' < '나');
//		
//		// 유니코드의 16진수를 활용하기

//		System.out.printf("%s\n", Integer.toString(0xAC00,2));
//		System.out.printf("%o\n", 0xAC00);
//		System.out.printf("%d\n", 0xAC00);
//		System.out.printf("%x\n", 0xAC00);
//		System.out.printf("%c\n", 0xAC00);
//		
		Scanner sc = new Scanner(System.in);
		char a, b, c, d, e, f;
		String str;
		String str2;
		
		a ='q';
		b =' ';
		c ='5';
		d ='d';
		e ='겹';
		f ='국';
		str = "exit";
		
		System.out.println(a == 'q' || a == 'Q' );
		System.out.println(b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		System.out.printf("%s\n", e >= 0xAC00 && e <= 0xD7AF);
		System.out.printf("%s\n", (f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		
		System.out.print("영어를 기입하시오 > ");
		str2 = sc.next();
		System.out.printf("%s\n", str.equals(str2) );
		
		System.out.print("입력 > ");
		System.out.println("입력한 문자열이 exit인가요? " + "exit".equals(sc.next()));
		

		
		
		
		
	}
}
