package quiz;

import java.util.Scanner;

public class B02_AppleQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_of_apples;

		System.out.print("�����ϰ� ���� ����� ���� �Է��ϼ��� > ");
		number_of_apples = sc.nextInt();
//		if (number_of_apples % 10 == 0) {
//			System.out.printf("�ٱ��ϰ� %d�� �ʿ��մϴ�. ", number_of_apples / 10);			
//		} else {
//			System.out.printf("�ٱ��ϰ� %d�� �ʿ��մϴ�. ", number_of_apples / 10 + 1);
//		}
		
		if(number_of_apples >= 0) {
			int neeedBasket = (int)Math.ceil(number_of_apples / 10.0);
			System.out.printf("�ʿ��� �ٱ����� ���� " + neeedBasket + "��" );
		} else {
			System.out.println("����� ������ �߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
