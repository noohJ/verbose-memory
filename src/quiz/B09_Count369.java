package quiz;

import java.util.Scanner;

public class B09_Count369 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.print("정수를 입력하세요 > ");
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
			System.out.printf("박수는 총 %d번 칩니다.",count);
		} else {
			System.out.println("올바른 정수가 아닙니다.");
		}
	}
}
