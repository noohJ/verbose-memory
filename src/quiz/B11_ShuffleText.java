package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B11_ShuffleText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("������ �Է��ϼ��� > ");		
		char[] text = sc.nextLine().toCharArray();
		
		//1. �׳� ����
//		for (int i = 0; i < 100; ++i) {
//			int x = (int)(Math.random()*text.length);
//			int y = (int)(Math.random()*text.length);
//			
//			char temp = text[x];
//			text[x] = text[y];
//			text[y] = temp;
//		}
//		System.out.println(text);
		
		//2. ��� ���� �迭 �����
		int[] printOrder = new int[text.length];
		
		for (int i = 0; i < printOrder.length; ++i) {
			int ran =(int)(Math.random() * text.length);
			printOrder[i] = ran;
			
			for (int chk = 0; chk <i ; ++chk) {
				if (printOrder[chk] == ran) {
					--i;
					break;
				}
			}
		}
		// java.util.Arrays.toString(): �迭�� ���� ���� ������ ���ڿ��� ��ȯ�Ѵ� 
		System.out.println(Arrays.toString(printOrder));
		
		for (int i = 0; i < printOrder.length; ++i) {
			System.out.print(text[printOrder[i]]);
		}
		System.out.println();

		

	}
}
