package quiz;

import java.util.Scanner;

public class B08_Prime01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count;
		System.out.print("숫자를 입력하세요 > ");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("1 이상의 수를 기입하세요.");
		}
		for (int i = 1 ; i <= num ; ++i) {
			count = 0;
			for (int j = 1; j <= i; ++j) {
				if (i %j !=0) {
					continue;
				} else {
					++count;
				}
			
			} 
			
			if (count != 2) {
				continue;
			} else {
				System.out.println(i);
			}
			
		}
	}
}
