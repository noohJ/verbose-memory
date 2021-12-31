package quiz;

import java.util.Scanner;

public class A08_Elevator {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);  // Ctrl + shift + O (자동 import)
		
		double first_stuff, second_stuff; 
		
		System.out.print("두 화물의 무게를 입력하세요 > ");
		first_stuff = sc.nextDouble();
		second_stuff = sc.nextDouble();
		
		System.out.println("화물1:" + first_stuff + "kg");
		System.out.println("화물2:" + second_stuff + "kg");
		System.out.printf("사용가능한 무게는 %.2fkg 입니다.\n", 600-(first_stuff+second_stuff));
		
	}
}
