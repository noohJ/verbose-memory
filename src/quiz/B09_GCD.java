package quiz;

import java.util.Scanner;

public class B09_GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_1, no_2;
		
		System.out.print("�� ���� �Է��ϼ��� > ");
		no_1 = sc.nextInt();
		no_2 = sc.nextInt();
//		if (no_1 < no_2) {
//			for(int i = no_1; i > 0; i--) {
//				if (no_1 % i == 0) {
//					for (int a = no_2; a > 0; a--) {
//						if(i * a == no_2) {
//							System.out.println(i);
//						}
//					}
//					break;
//				}
//			}			
//		} else {
//			for(int i = no_2; i > 0; i--) {
//				if (no_2 % i == 0) {
//					for (int a = no_1; a > 0; a--) {
//						if(i * a == no_1) {
//							System.out.println(i);
//						}
//					}
//					break;
//				}
//			}
//		}
		
//		 # �� ���� �� �� ���� ���� ���ϱ�
//		int min = no_1 > no_2 ? no_2 : no_1;
		int min= Math.min(no_1,no_2);
		
		for (int i = min; i > 0; i--) {
			if (no_1 % i == 0 && no_2 % i ==0) {
				System.out.println(i);
				break;
			}
		}						
	}
}
