package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("��� �ΰ���?");
		month = sc.nextInt();
		
		switch (month) {
		case 12,1,2:
			System.out.println("�ܿ�");
			break;
		case 3,4,5:
			System.out.println("��");
			break;
		case 6,7,8:
			System.out.println("����");
			break;
		case 9,10,11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ƴϴ� �ùٸ� ����");
			break;
		}
	}
}
