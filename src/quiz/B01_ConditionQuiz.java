package quiz;

import java.util.Scanner;

public class B01_ConditionQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e, hour, year, ms_birth, cs_birth;
		boolean powerOn;
		String str;
		
//		System.out.print("a�� ���� �����Ͻÿ� > ");
//		a = sc.nextInt();
//		System.out.printf("a�� 10���� ũ�� 20���� ��������? %s\n", 10<a && a<20);
//		
//		System.out.print("b�� ���� �����Ͻÿ� > ");
//		b = sc.nextInt();
//		System.out.printf("b�� ¦���ΰ���? %s\n", b%2 == 0);
//		
//		System.out.print("c�� ���� �����Ͻÿ� > ");
//		c = sc.nextInt();
//		System.out.printf("c�� 7�� ����ΰ���? %s\n", c%7 == 0);
//		
//		System.out.print("hour�� �����Ͻÿ� > ");
//		hour = sc.nextInt();
//		System.out.printf("%s\n", (!((hour<0)||(24<=hour))) && 12 <= hour);
//		
//		System.out.print("d��e �� ���� �����Ͻÿ� > ");
//		d = sc.nextInt();
//		e = sc.nextInt();
//		System.out.printf("d�� e�� ���̴� 30�Դϱ�? %s\n", d - e==30 || e-d==30);
//		
//		System.out.print("year�� �����Ͻÿ� > ");
//		year = sc.nextInt();
//		System.out.printf("%s\n", (year%400 == 0) || ((year%4 ==0) && (year%100 !=0)));
//		
//		System.out.print("�μ��� ��� ���ΰ���? > ");
//		ms_birth = sc.nextInt();
//		System.out.print("ö���� ��� ���ΰ���? > ");
//		cs_birth = sc.nextInt();
//		System.out.printf("�μ��� ������ ö������ 3���� �� ��������? %s", ms_birth+3 == cs_birth);
//		
//		System.out.print("'powerOn'�� ���¸� �����Ͻÿ� (false/true) > ");
//		powerOn = sc.nextBoolean();
//		System.out.printf("%s", !powerOn );
		
//		System.out.print("'str'�� ���¸� �����Ͻÿ� (yes/no) > ");
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
		
		System.out.printf("a�� 10���� ũ�� 20���� ��������? %s\n", 10 < a && a < 20);
		System.out.printf("b�� ¦���ΰ���? %s\n", b % 2 == 0);
		System.out.printf("c�� 7�� ����ΰ���? %s\n", c % 7 == 0);
		System.out.printf("%s\n", (!((hour < 0)||(24 <= hour))) && 12 <= hour);
		System.out.printf("d�� e�� ���̴� 30�Դϱ�? %s\n", d - e == 30 || e - d == 30);
		System.out.printf("%s\n", (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		System.out.printf("�μ��� ������ ö������ 3���� �� ��������? %s\n", ms_birth+3 == cs_birth);
		System.out.printf("%s\n", !powerOn );
		
		// - ������ ������ == ���� ���ҋ� ������ ��ü���� ���Ѵ�.
		// - ���� �ٸ� ��ü������ ���� ���� ������� Ȯ���ҋ��� equalls() �޼��带 ����Ѵ�.
		str = "yes";
		String str2 = new String("yes");
		System.out.println("str.equals(str2): " + str.equals(str2));
		System.out.print(str =="yes");

	
	}
}
