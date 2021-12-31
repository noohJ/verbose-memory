package quiz;

import java.util.Scanner;

public class B01_ConditionQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e, hour, year, ms_birth, cs_birth;
		boolean powerOn;
		String str;
		
//		System.out.print("a의 수를 기입하시오 > ");
//		a = sc.nextInt();
//		System.out.printf("a가 10보다 크도 20보다 작은가요? %s\n", 10<a && a<20);
//		
//		System.out.print("b의 수를 기입하시오 > ");
//		b = sc.nextInt();
//		System.out.printf("b는 짝수인가요? %s\n", b%2 == 0);
//		
//		System.out.print("c의 수를 기입하시오 > ");
//		c = sc.nextInt();
//		System.out.printf("c는 7의 배수인가요? %s\n", c%7 == 0);
//		
//		System.out.print("hour을 기입하시오 > ");
//		hour = sc.nextInt();
//		System.out.printf("%s\n", (!((hour<0)||(24<=hour))) && 12 <= hour);
//		
//		System.out.print("d와e 의 수를 기입하시오 > ");
//		d = sc.nextInt();
//		e = sc.nextInt();
//		System.out.printf("d와 e의 차이는 30입니까? %s\n", d - e==30 || e-d==30);
//		
//		System.out.print("year을 기입하시오 > ");
//		year = sc.nextInt();
//		System.out.printf("%s\n", (year%400 == 0) || ((year%4 ==0) && (year%100 !=0)));
//		
//		System.out.print("민수는 몇월 생인가요? > ");
//		ms_birth = sc.nextInt();
//		System.out.print("철수는 몇월 생인가요? > ");
//		cs_birth = sc.nextInt();
//		System.out.printf("민수의 생일은 철수보다 3개월 더 빠른가요? %s", ms_birth+3 == cs_birth);
//		
//		System.out.print("'powerOn'의 상태를 기입하시오 (false/true) > ");
//		powerOn = sc.nextBoolean();
//		System.out.printf("%s", !powerOn );
		
//		System.out.print("'str'의 상태를 기입하시오 (yes/no) > ");
//		str = sc.next();
//		System.out.print(str =="yes");
		a = 17;
		b = 10;
		c = 21;
		d = 17;
		e = 28;
		hour = 14;
		year = 1984;
		ms_birth = 6;
		cs_birth = 12;
		powerOn = false;
		
		System.out.printf("a가 10보다 크도 20보다 작은가요? %s\n", 10 < a && a < 20);
		System.out.printf("b는 짝수인가요? %s\n", b % 2 == 0);
		System.out.printf("c는 7의 배수인가요? %s\n", c % 7 == 0);
		System.out.printf("%s\n", (!((hour < 0)||(24 <= hour))) && 12 <= hour);
		System.out.printf("d와 e의 차이는 30입니까? %s\n", d - e == 30 || e - d == 30);
		System.out.printf("%s\n", (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		System.out.printf("민수의 생일은 철수보다 3개월 더 빠른가요? %s\n", ms_birth+3 == cs_birth);
		System.out.printf("%s\n", !powerOn );
		
		// - 참조형 변수는 == 으로 비교할떄 동일한 객체인지 비교한다.
		// - 서로 다른 객체이지만 같은 값을 지녔는지 확인할떄는 equalls() 메서드를 사용한다.
		str = "yes";
		String str2 = new String("yes");
		System.out.println("str.equals(str2): " + str.equals(str2));
		System.out.print(str =="yes");

	
	}
}
