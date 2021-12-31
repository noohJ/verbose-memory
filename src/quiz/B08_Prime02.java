package quiz;

import java.util.Scanner;

public class B08_Prime02 {
	public static void main(String[] args) {
		
		System.out.print("숫자 > ");
		int input = new Scanner(System.in).nextInt(); 
		
		for(int num = 2; num < input; ++num) {
			boolean prime = true;
			
			for (int chk =2,half = (int)Math.sqrt(num); chk < half; ++chk) {
				if (num % chk == 0) {
					prime =false;
					break;
				}
			}
			System.out.printf("[%d]는 %s\n", num,prime ?"소수 입니다.":"소수가 아닙니다.");
		}
	}
}
