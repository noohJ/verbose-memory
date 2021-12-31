package quiz;

import java.util.Scanner;

public class B02_AppleQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_of_apples;

		System.out.print("구매하고 싶은 사과의 수를 입력하세요 > ");
		number_of_apples = sc.nextInt();
//		if (number_of_apples % 10 == 0) {
//			System.out.printf("바구니가 %d개 필요합니다. ", number_of_apples / 10);			
//		} else {
//			System.out.printf("바구니가 %d개 필요합니다. ", number_of_apples / 10 + 1);
//		}
		
		if(number_of_apples >= 0) {
			int neeedBasket = (int)Math.ceil(number_of_apples / 10.0);
			System.out.printf("필요한 바구니의 개수 " + neeedBasket + "개" );
		} else {
			System.out.println("사과의 개수를 잘못 입력하셨습니다.");
		}
	}
}
