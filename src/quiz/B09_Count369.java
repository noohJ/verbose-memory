package quiz;

import java.util.Scanner;

public class B09_Count369 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.print("������ �Է��ϼ��� > ");
		int end =sc.nextInt();
		
		int i = 1;

		if (end > 0) {
			while (i<=end) {
				int d = i;
				
				while(d != 0) {
					
					if (d % 10 == 3 || d % 10 == 6 || d % 10 == 9) {
						++count;
						d = (int) (d * 0.1);
					}else {
						d = (int) (d * 0.1);
					}
				}
				++i;
			}
			System.out.printf("�ڼ��� �� %d�� Ĩ�ϴ�.",count);
		} else {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
		}
	}
}
