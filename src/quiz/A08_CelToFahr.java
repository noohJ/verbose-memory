package quiz;

import java.util.Scanner;

public class A08_CelToFahr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요 > ");
		double temperature = sc.nextDouble();
		
		System.out.printf("화씨 온도는 %.1f°F입니다.", (temperature * 9/5) + 32);
	}
}
