package quiz;

import java.util.Scanner;

public class B02_MakeGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요 > ");
		score = sc.nextInt();
		
		if (score >=0 && score <=100) {
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70 ) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("유효하지 않은 점수 입니다.");
		}
	}
}
