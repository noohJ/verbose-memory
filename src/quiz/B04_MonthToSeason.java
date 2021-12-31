package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("몇월 인가요?");
		month = sc.nextInt();
		
		switch (month) {
		case 12,1,2:
			System.out.println("겨울");
			break;
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		default:
			System.out.println("아니다 올바른 달이");
			break;
		}
	}
}
