package quiz;

import java.util.Scanner;

public class A08_CelToFahr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է��ϼ��� > ");
		double temperature = sc.nextDouble();
		
		System.out.printf("ȭ�� �µ��� %.1f��F�Դϴ�.", (temperature * 9/5) + 32);
	}
}
