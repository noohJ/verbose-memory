package quiz;

import java.util.Scanner;

public class B06_ForBasicQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number_inserted, result = 0;
		
		System.out.print("숫자를 입력하세요 > ");
		number_inserted = sc.nextInt();
		
		if (number_inserted > 100) {
			for (int i = 100; i <= number_inserted; ++i) {
				result += i;
			} System.out.println(result);
		}else {
			for (int i = 100; i >= number_inserted; --i) {
				result += i;
			} System.out.println(result);
		}

		
		if (number_inserted > 1000) {
			for (int i = 1000; i <=number_inserted; ++i) {
				System.out.println(i);
			}
		}else {
			for (int i = 1000; i >= number_inserted; --i) {
				System.out.println(i);
			}
		}
		
		if (number_inserted > 0) {
			for (int i = 1; i <= number_inserted; ++i) {
				if (i % 7 == 0) {
					System.out.println(i);
				} 
			}			
		} else {
			for (int i = 1; i >= number_inserted; --i) {
				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
		}

	}
}
