package quiz;

import java.util.Scanner;

public class B01_ConditionQuiz2 {
	public static void main(String[] args) {
//		// ���ڳ��� ũ�� ���غ���
//		// - char Ÿ�� �����ʹ� ������ �������� ���ϰ� �ֱ� ������ ���ڳ�����
//		//   ũ�� �񱳰� �����ϴ�
//		System.out.println('A' < 'T');
//		System.out.println('��' < '��');
//		
//		// �����ڵ��� 16������ Ȱ���ϱ�

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
		e ='��';
		f ='��';
		str = "exit";
		
		System.out.println(a == 'q' || a == 'Q' );
		System.out.println(b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		System.out.printf("%s\n", e >= 0xAC00 && e <= 0xD7AF);
		System.out.printf("%s\n", (f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		
		System.out.print("��� �����Ͻÿ� > ");
		str2 = sc.next();
		System.out.printf("%s\n", str.equals(str2) );
		
		System.out.print("�Է� > ");
		System.out.println("�Է��� ���ڿ��� exit�ΰ���? " + "exit".equals(sc.next()));
		

		
		
		
		
	}
}
